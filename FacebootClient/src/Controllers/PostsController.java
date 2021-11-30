/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivy
 */
public class PostsController extends BaseController {
    
    /**
     * PostsController constructor.
     *
     * @param app
     */
    public PostsController(App app) {
        super(app);
    }
    
    public void AttemptPost(String contents, byte[] picture){
        if (picture == null)
            picture = new byte[0];
        
        try {
            app.Client.DoPost(contents, picture);
        } catch (Exception ex) {
            ex.printStackTrace();
            app.DisplayErrorMessage("Error al postear", ex.getMessage());
        }
    }
    
}
