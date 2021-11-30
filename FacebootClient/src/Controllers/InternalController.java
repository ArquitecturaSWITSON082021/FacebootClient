/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Faceboot.App;
import Faceboot.AppState;
import Faceboot.Utils;
import FacebootNet.Packets.Server.SConnectionErrorPacket;
import FacebootNet.Packets.Server.SLoginPacket;
import FacebootNet.Packets.Server.SRegisterPacket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 * InternalController, may get called when client receives packets with
 * InternalController opcodes.
 *
 * @author Ivy
 */
public class InternalController extends BaseController {

    /**
     * InternalController constructor.
     *
     * @param app
     */
    public InternalController(App app) {
        super(app);
    }

    public void OnSocketError(SConnectionErrorPacket packet){
            Utils.ShowErrorMessage(String.format(
                    "No ha sido posible conectarse al servidor de Faceboot. Por favor reintente de nuevo más tarde. "
                    + "Código de error: %d\n"
                    + "Error interno de la biblioteca de red: \"%s\".", packet.ErrorCode, packet.Message));
            System.exit(0);
    }

}
