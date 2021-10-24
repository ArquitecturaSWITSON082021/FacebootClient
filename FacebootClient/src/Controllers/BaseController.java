/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;

/**
 *
 * @author Ivy
 */
public class BaseController {
    protected App app;
    
    public BaseController(App app){
        this.app = app;
    }
}
