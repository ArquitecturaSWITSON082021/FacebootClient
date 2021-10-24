package Faceboot;
import Callbacks.HelloPacketCallback;
import Callbacks.MessageRouterCallback;
import FacebootNet.Engine.AbstractPacket;
import FacebootNet.Engine.Opcodes;
import FacebootNet.Engine.PacketBuffer;
import FacebootNet.FacebootNetClient;
import FacebootNet.Packets.Server.SFetchPostsPacket;
import FacebootNet.Packets.Server.SHelloPacket;
import FacebootNet.Packets.Server.SLoginPacket;
import View.Home;
import View.Login;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public View.Home HomeView;
    public View.Register RegisterView;
    public View.Profile ProfileView;
    public View.Settings SettingsView;
    public View.SettingsAccounts SettingsAccountsView;
    private AppState State;
    
    public App(){
        
        App.AppSingleton = this;
        State = AppState.Initializing;
        // Create application views and hide them by default.
        LoginView = new View.Login();
        LoginController = new Controllers.LoginController(this);
        HomeView = new View.Home();
        HomeController = new Controllers.HomeController(this);
        RegisterView = new View.Register();
        ProfileView = new View.Profile();
        SettingsView = new View.Settings();
        SettingsAccountsView = new View.SettingsAccounts();
        
        // Create network client.
        Client = new FacebootNetClient("127.0.0.1", 3400);
        Client.OnHelloMessage = new HelloPacketCallback(this);
        Client.OnMessage = new MessageRouterCallback(this);
        try {
            Client.Start();
        } catch (Exception ex) {
            Utils.ShowErrorMessage("FacebootNetClient error: " + ex.getMessage() + "\n\n" + ex.getStackTrace());
        }
    }
    
    public AppState GetState(){
        return State;
    }
    
    public void SetState(AppState newState){
        State = newState;
        
        LoginView.setVisible(State == AppState.Login);
        HomeView.setVisible(State == AppState.Home);
        RegisterView.setVisible(State == AppState.Register);
        ProfileView.setVisible(State == AppState.Profile);
        SettingsView.setVisible(State == AppState.Settings);      
        SettingsAccountsView.setVisible(State == AppState.LinkedAccounts);
    }
    
    public void OnHello(SHelloPacket request){
        System.out.printf("[+] Got hello response from server. ApplicationVersion=%d, IsAuthServiceRunning=%b.\n",
                request.ApplicationVersion,
                request.IsAuthServiceRunning);
        
        if (!request.IsAuthServiceRunning){
            Utils.ShowErrorMessage("El servicio de autentiación se encuentra deshabilitado.");
        }
        
        SetState(AppState.Login);
    }
    
    public void OnMessageRouter(PacketBuffer packet){
        try {
            byte[] data = packet.Serialize();
            String hex = Utils.BytesToHex(data);
            System.out.println("[+] Got packet from server: " + hex);
            
            if (packet.GetOpcode() == Opcodes.Login)
                LoginController.OnLogin(SLoginPacket.Deserialize(data));
            else if (packet.GetOpcode() == Opcodes.FetchPosts)
                HomeController.OnFetchPosts(SFetchPostsPacket.Deserialize(data));
            
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
    
    public static App GetSingleton(){
        return AppSingleton;
    }
}
