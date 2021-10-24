/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Callbacks;

import Faceboot.App;
import Faceboot.Utils;
import FacebootNet.Engine.AbstractPacket;
import FacebootNet.Engine.PacketBuffer;
import FacebootNet.FacebootNetCallback;

/**
 *
 * @author Ivy
 */
public class MessageRouterCallback extends FacebootNetCallback<byte[]> {

    private App app;
    
    public MessageRouterCallback(App app){
        super();
        this.app = app;
    }
    
    @Override
    public Object call() throws Exception{
        PacketBuffer packet = new PacketBuffer(GetRequest());
        app.OnMessageRouter(packet);
        return null;
    }
    
}
