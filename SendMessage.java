/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class SendMessage {
    public void sendToTelegram(String s) {
        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        
        //Add Telegram token (given Token is fake)
        String apiToken = "5875925223:AAEVnznmPQ5t30GjDyyMxT_ncTcNGjNeGxI";
      
        //Add chatId (given chatId is fake)
        String chatId = "1023333557";
        String text = "Hello world!" + s;

        urlString = String.format(urlString, apiToken, chatId, text);

        try {
            URL url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = new BufferedInputStream(conn.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
