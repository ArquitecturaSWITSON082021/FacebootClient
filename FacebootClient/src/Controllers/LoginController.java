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
 * LoginController, may get called when client receives packets with
 * LoginController opcodes.
 *
 * @author Ivy
 */
public class LoginController extends BaseController {

    /**
     * LoginController constructor.
     *
     * @param app
     */
    public LoginController(App app) {
        super(app);
    }

    /**
     * Attempts to login with a given email and password.
     *
     * @param Email
     * @param Password
     */
    public void AttemptLogin(String Email, String Password) {
        try {

            if (!Utils.IsEmail(Email)) {
                throw new Exception("El correo proporcionado es inválido.");
            }

            if (Password.length() <= 0) {
                throw new Exception("La contraseña no puede estar vacía.");
            }

            // If everything is valid, attempt to login with server.
            app.Client.DoLogin(Email, Password);
        } catch (Exception e) {
            Utils.ShowErrorMessage("Error al iniciar sesión: " + e.getMessage());
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
        app.UserId = request.UserId;
        app.UserName = request.UserName;
    }
}
