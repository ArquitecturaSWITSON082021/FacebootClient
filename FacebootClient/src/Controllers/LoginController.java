/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;
import Faceboot.AppState;
import FacebootNet.Packets.Server.SLoginPacket;

/**
 *
 * @author Ivy
 */
public class LoginController extends BaseController {

    public LoginController(App app) {
        super(app);
    }
    
    public void OnLogin(SLoginPacket request){
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
