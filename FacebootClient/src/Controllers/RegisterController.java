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
import FacebootNet.Packets.Server.SRegisterPacket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

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
    public void AttemptRegister(String Name, String LastName, String Email, String Phone, String Password, String ConfirmPassword, String Birthday, String Gender){
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
            
            if (Phone.length() <= 0){
                throw new Exception("El numero de telefono no puede estar vacio.");
            }
            
            if (Password.length() <= 0) {
                throw new Exception("La contraseña no puede estar vacía.");
            }
            
            if (!Password.equalsIgnoreCase(ConfirmPassword)){
                throw new Exception("Las contraseñas no coinciden.");
            }
            
            Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(Birthday);
            Date today = new Date();
            
            Period period = Period.between(dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            if (period.getYears() < 18){
                throw new Exception("Es necesario ser mayor de edad para completar el registro.");
            }
            
            // If everything is valid, attempt to register with server.
            
            app.Client.DoRegister(
                    Name,
                    LastName,
                    Email,
                    Password,
                    Phone,
                    Gender,
                    Birthday
            );
            /**/
        } catch (Exception e) {
            App.GetSingleton().DisplayErrorMessage("Error al registrarse", e.getMessage());
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

        if (request.ErrorCode == 0){
            app.UserId = request.UserId;
            app.UserName = request.UserName;
            app.SetState(AppState.Home);
        }else {
            App.GetSingleton().DisplayErrorMessage("Error", "Ha ocurrido un problema al intentar iniciar sesión, verifique que sus datos sean correctos. Error: " + request.ErrorCode); 
            return;
        }
        
    }
    
    /**
     * OnLogin route. If called, it will update the application state depending
     * the server result.
     *
     * @param request
     */
    public void OnRegister(SRegisterPacket request) {
        System.out.printf("[*] [LoginController.OnRegister] ErrorCode: %d, UserId: %d, UserName: %s\n",
                request.ErrorCode,
                request.UserId,
                request.UserName);
        
        if (request.ErrorCode == 0){
            app.SetState(AppState.Login);
            Utils.ShowInfoMessage("Registro exitoso."); 
            return;
        }else {
            App.GetSingleton().DisplayErrorMessage("Error", "Ha ocurrido un problema al intentar registrarse, verifique su correo y teléfono. Error: " + request.ErrorCode); 
            return;
        }
    }
}
