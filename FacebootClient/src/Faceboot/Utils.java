package Faceboot;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Simple class which holds some utility functions.
 * @author Ivy
 */
public class Utils {
    
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
public static String BytesToHex(byte[] bytes) {
    char[] hexChars = new char[bytes.length * 2];
    for (int j = 0; j < bytes.length; j++) {
        int v = bytes[j] & 0xFF;
        hexChars[j * 2] = HEX_ARRAY[v >>> 4];
        hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
    }
    return new String(hexChars);
}
    
    public static void ShowInfoMessage(String Msg){
        JOptionPane.showMessageDialog(null, Msg, "", INFORMATION_MESSAGE);
    }

    public static void ShowErrorMessage(String Error){
        JOptionPane.showMessageDialog(null, Error, "Error", ERROR_MESSAGE);
    }
    
    public static boolean IsEmail(String email){
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);

        return mat.matches();
    }
}
