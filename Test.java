/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.InputStream;
import test.ReadWriteFile;
import test.SendMessage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import test.CheckResult;
import test.Generator;
import test.ReadArchive;
        

/**
 *
 * @author alebo
 */
public class Test
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException
    {
        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.minusMinutes(5);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String ldtFormatted = ldt.format(myFormatObj);
        //ReadWriteFile rfile = new ReadWriteFile();
        //String line = rfile.readFile();
        //String[] s1 = line.split(" ");
        //int bet[] = new int[8];
        //for (int i = 1; i < 9; i++)
        //{
        //    bet[i - 1] = (Integer.parseInt(s1[i]));
        //}
        int result[] =
        {
            1, 3, 5, 7, 13, 14, 15, 16
        };
        //int win = CheckResult.checkTirage(bet, result);
        //System.out.println(win);
//        int [] rnd = Generator.generateRandom();
//        for(int i:rnd)
//            System.out.print(i + " ");
         int res [] = ReadArchive.read("10.01.2023 23:07");
         for(int i:res)
            System.out.print(i + " ");
//        rfile.writeFile();
//        SendMessage sndMsg = new SendMessage();
//        sndMsg.sendToTelegram(" Telegram");
//        System.out.println(ldtFormatted);
    }

}
