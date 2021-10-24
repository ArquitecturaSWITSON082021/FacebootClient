/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callbacks;

import Faceboot.App;
import FacebootNet.FacebootNetCallback;
import FacebootNet.Packets.Server.SHelloPacket;

/**
 *
 * @author Ivy
 */
public class HelloPacketCallback extends FacebootNetCallback<SHelloPacket> {

    private App app;
    
    public HelloPacketCallback(App app){
        super();
        this.app = app;
    }
    
    @Override
    public Object call(){
        app.OnHello((SHelloPacket)GetRequest());
        return null;
    }
    
}