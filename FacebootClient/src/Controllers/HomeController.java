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
 *
 * @author Ivy
 */
public class HomeController extends BaseController {

    public HomeController(App app) {
        super(app);
    }
    
    public void OnFetchPosts(SFetchPostsPacket packet){
        System.out.printf("[HomeController.OnFetchPosts] TotalPosts=%d\n", packet.GetPosts().size());
    }
}
