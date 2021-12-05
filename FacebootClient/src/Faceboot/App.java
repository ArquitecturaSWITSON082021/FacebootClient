package Faceboot;

import Callbacks.HelloPacketCallback;
import Callbacks.MessageRouterCallback;
import FacebootNet.Engine.AbstractPacket;
import FacebootNet.Engine.ErrorCode;
import FacebootNet.Engine.Opcodes;
import FacebootNet.Engine.PacketBuffer;
import FacebootNet.FacebootNetClient;
import FacebootNet.Packets.Server.SAttemptOauthPacket;
import FacebootNet.Packets.Server.SConnectionErrorPacket;
import FacebootNet.Packets.Server.SFetchPostsPacket;
import FacebootNet.Packets.Server.SHandshakePacket;
import FacebootNet.Packets.Server.SLoginPacket;
import FacebootNet.Packets.Server.SOauthPacket;
import FacebootNet.Packets.Server.SRegisterPacket;
import View.Home;
import View.Login;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivy
 */
public class App {

    private static App AppSingleton;

    public FacebootNetClient Client;

    public View.Login LoginView;
    public Controllers.LoginController LoginController;
    public Controllers.HomeController HomeController;
    public Controllers.RegisterController RegisterController;
    public Controllers.InternalController InternalController;
    public Controllers.PostsController PostsController;
    public View.Home HomeView;
    public View.Components.RegisterModal RegisterModal;
    public View.Components.CreatePostModal CreatePostModal;
    public View.Profile ProfileView;
    public View.Settings SettingsView;
    public View.SettingsAccounts SettingsAccountsView;
    private AppState State;

    // TODO: DELETE THIS AFTER
    public String UserName;
    public int UserId;
    // END

    // Entry point of Faceboot app.
    public App() {

        // Define the static application singleton to this one.
        App.AppSingleton = this;

        // Set the initial application state.
        State = AppState.Initializing;

        // Create all application views and hide them by default.
        LoginView = new View.Login();
        LoginController = new Controllers.LoginController(this);
        HomeView = new View.Home();
        HomeController = new Controllers.HomeController(this);
        RegisterModal = new View.Components.RegisterModal(LoginView, true);
        CreatePostModal = new View.Components.CreatePostModal(HomeView, true);
        RegisterController = new Controllers.RegisterController(this);
        InternalController = new Controllers.InternalController(this);
        PostsController = new Controllers.PostsController(this);
        ProfileView = new View.Profile();
        SettingsView = new View.Settings();
        SettingsAccountsView = new View.SettingsAccounts();

        // Create network client.
        Client = new FacebootNetClient("127.0.0.1", 3400);

        // Map all client callbacks.
        Client.OnHelloMessage = new HelloPacketCallback(this);
        Client.OnMessage = new MessageRouterCallback(this);
        try {
            // Attempt to start the network client.
            Client.Start();
        } catch (Exception ex) {
            DisplayErrorMessage("FacebootNetClient error", ex.getMessage() + "\n\n" + ex.getStackTrace());
        }
    }

    /**
     * Returns the current application state.
     *
     * @return
     */
    public AppState GetState() {
        return State;
    }

    /**
     * Changes the application state to the one provided, if given.
     *
     * @param newState
     */
    public void SetState(AppState newState) {
        // Update the application state.
        State = newState;

        // Hide and show the necessary views, given the state.
        LoginView.setVisible(State == AppState.Login || State == AppState.Register);
        HomeView.setVisible(State == AppState.Home || State == AppState.CreatePost);
        RegisterModal.setVisible(State == AppState.Register);
        CreatePostModal.setVisible(State == AppState.CreatePost);
        ProfileView.setVisible(State == AppState.Profile);
        SettingsView.setVisible(State == AppState.Settings);
        SettingsAccountsView.setVisible(State == AppState.LinkedAccounts);

    }

    /**
     * OnHelloPacket callback. Returns the server application version, services
     * running, etc.
     *
     * @param request
     */
    public void OnHello(SHandshakePacket request) {
        // Print hello response from server for debugging purposes.
        System.out.printf("[+] Got hello response from server. ApplicationVersion=%d, IsAuthServiceRunning=%b.\n",
                request.ApplicationVersion,
                request.IsAuthServiceRunning);

        // If server says that auth service is not running, throw an error and return.
        if (!request.IsAuthServiceRunning) {
            DisplayErrorMessage("Error", "El servicio de autenticación se encuentra deshabilitado.");
            return;
        }

        // If everything is okay, then switch to Login view state.
        SetState(AppState.Login);
    }

    /**
     * OnMessageRouter callback. This function gets called when server replies
     * with a valid packet, if given.
     *
     * @param packet
     */
    public void OnMessageRouter(PacketBuffer packet) {
        try {
            // Get the binary buffer from packet.
            byte[] data = packet.Serialize();

            // Print the hex representation of packet, for debugging purposes.
            String hex = Utils.BytesToHex(data);
            System.out.println("[+] Got packet from server: " + hex);

            // Packet router. If opcode is valid, then call controllers... if valid.
            if (packet.GetOpcode() == Opcodes.Login) {
                LoginController.OnLogin(SLoginPacket.Deserialize(data));
            } else if (packet.GetOpcode() == Opcodes.FetchPosts) {
                HomeController.OnFetchPosts(SFetchPostsPacket.Deserialize(data));
            } else if (packet.GetOpcode() == Opcodes.DoRegister) {
                RegisterController.OnRegister(SRegisterPacket.Deserialize(data));
            } else if (packet.GetOpcode() == Opcodes.SocketError) {
                InternalController.OnSocketError(SConnectionErrorPacket.Deserialize(data));
            } else if (packet.GetOpcode() == Opcodes.AttemptOauth){
                LoginController.OnAttemptOauth(SAttemptOauthPacket.Deserialize(data));
            } else if (packet.GetOpcode() == Opcodes.RegisterOauth){
                RegisterController.OnOauthInfo(SOauthPacket.Deserialize(data));
            }

        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new App();
    }

    /**
     * Returns the application singleton.
     *
     * @return
     */
    public static App GetSingleton() {
        return AppSingleton;
    }
    
    public void DisplayErrorMessage(int errorCode) {
        Utils.ShowErrorMessage("Error", String.format("%s Código de error: %d", 
                ErrorCode.Format(errorCode),
                errorCode
        ));
    }

    public void DisplayErrorMessage(String title, String error) {
        Utils.ShowErrorMessage(title, error);
    }
}
