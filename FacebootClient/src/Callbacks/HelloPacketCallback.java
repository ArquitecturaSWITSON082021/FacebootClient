/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callbacks;

import Faceboot.App;
import FacebootNet.FacebootNetCallback;
import FacebootNet.Packets.Server.SHandshakePacket;

/**
 * HelloPacketCallback, may get called if given on FacebootNet.Client.
 * @author Ivy
 */
public class HelloPacketCallback extends FacebootNetCallback<SHandshakePacket> {

    private App app;
    
    public HelloPacketCallback(App app){
        super();
        this.app = app;
    }
    
    @Override
    public Object call(){
        app.OnHello((SHandshakePacket)GetRequest());
        return null;
    }
    
}
