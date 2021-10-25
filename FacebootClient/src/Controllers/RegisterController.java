/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;
import Faceboot.AppState;
import Faceboot.Utils;
import FacebootNet.Packets.Server.SLoginPacket;

/**
 * RegisterController, may get called when client receives packets with
 * RegisterController opcodes.
 *
 * @author Ivy
 */
public class RegisterController extends BaseController {

    /**
     * RegisterController constructor.
     *
     * @param app
     */
    public RegisterController(App app) {
        super(app);
    }

    /**
     * Attempts to login with a given email and password.
     *
     * @param email
     * @param password
     */
    public void AttemptRegister(String Name, String LastName, String Email, String Password) {
        try {
            
            if (Name.length() <= 0) {
                throw new Exception("El nombre no puede estar vacío.");
            }
            
            if (LastName.length() <= 0) {
                throw new Exception("Los apellidos no pueden estar vacíos.");
            }

            if (!Utils.IsEmail(Email)) {
                throw new Exception("El correo proporcionado es inválido.");
            }

            if (Password.length() <= 0) {
                throw new Exception("La contraseña no puede estar vacía.");
            }

            // If everything is valid, attempt to register with server.
            app.SetState(AppState.Login);
            Utils.ShowInfoMessage("Registro exitoso");
        } catch (Exception e) {
            Utils.ShowErrorMessage("Error al registrarse: " + e.getMessage());
        }
    }

    /**
     * OnLogin route. If called, it will update the application state depending
     * the server result.
     *
     * @param request
     */
    public void OnLogin(SLoginPacket request) {
        System.out.printf("[*] [LoginController.OnLogin] ErrorCode: %d, UserId: %d, UserName: %s, UserEmail: %s, UserGender: %s, Token: %s\n",
                request.ErrorCode,
                request.UserId,
                request.UserName,
                request.UserEmail,
                request.UserGender,
                request.TokenId);

        app.SetState(AppState.Home);
    }
}
