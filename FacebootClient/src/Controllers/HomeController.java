/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;
import FacebootNet.Packets.Client.CFetchPostsPacket;
import FacebootNet.Packets.Server.SFetchPostsPacket;

/**
 * HomeController, may get called when client receives packets with HomeController opcodes.
 * @author Ivy
 */
public class HomeController extends BaseController {

    /**
     * HomeController constructor.
     * @param app 
     */
    public HomeController(App app) {
        super(app);
    }
    
    /**
     * OnFetchPosts route. If called, it will update the application state depending the server result.
     * @param packet 
     */
    public void OnFetchPosts(SFetchPostsPacket packet){
        System.out.printf("[HomeController.OnFetchPosts] TotalPosts=%d\n", packet.GetPosts().size());
        app.HomeView.RenderPosts(packet.GetPosts());
    }
}
