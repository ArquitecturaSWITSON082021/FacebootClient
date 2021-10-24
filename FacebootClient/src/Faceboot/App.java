package Faceboot;
import Callbacks.HelloPacketCallback;
import FacebootNet.FacebootNetClient;
import FacebootNet.Packets.Server.SHelloPacket;
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
    
    public View.Login LoginView;
    public View.Home HomeView;
    public View.Register RegisterView;
    
    public App(){
        // Create application views and hide them by default.
        LoginView = new View.Login();
        HomeView = new View.Home();
        // RegisterView = new View.Register();
        
        // Create network client.
        FacebootNetClient client = new FacebootNetClient("127.0.0.1", 3400);
        client.OnHelloMessage = new HelloPacketCallback(this);
        try {
            client.Start();
        } catch (Exception ex) {
            Utils.ShowErrorMessage("FacebootNetClient error: " + ex.getMessage() + "\n\n" + ex.getStackTrace());
        }
    }
    
    public void OnHello(SHelloPacket request){
        System.out.printf("[+] Got hello response from server. ApplicationVersion=%d, IsAuthServiceRunning=%b.\n",
                request.ApplicationVersion,
                request.IsAuthServiceRunning);
        
        if (!request.IsAuthServiceRunning){
            Utils.ShowErrorMessage("El servicio de autentiación se encuentra deshabilitado.");
        }
        
        LoginView.setVisible(true);
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

        /* Create and display the form */
        /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        }); */
        
        new App();
    }
}
