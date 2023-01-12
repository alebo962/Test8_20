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
import test.GetTime;

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
        String tm = GetTime.getTime();
 //       int result[] = ReadArchive.read("10.01.2023 23:07");// (tm)
//
//        for (int i : result)
//        {
//            System.out.print(i + " ");
//        }

        int[] bet = decodeString(ReadWriteFile.readFile());

        int sum = bet[bet.length - 2];
    //    sum += CheckResult.checkTirage(bet, result);

        int num = bet[bet.length - 1];
        
        int [] rnd = Generator.generateRandom();
        //for(int i:rnd)
            
//        for(int i:bet)
//            System.out.print(i + " ");
        String s = tm.split(" ")[1]
                + " "
                + Arrays.toString(Arrays.copyOf(bet, 9)).replaceAll("^\\[|\\]$", "").replaceAll(",", "")
                + " " + Integer.toString(sum)
                + " " + Integer.toString(num);
        
        System.out.println(s);
        ReadWriteFile.writeFile(s);
//        int result[] =
//        {
//            1, 3, 5, 7, 13, 14, 15, 16
//        };

        
//        int [] rnd = Generator.generateRandom();
//        for(int i:rnd)
//            System.out.print(i + " ");
//        rfile.writeFile();
//        SendMessage sndMsg = new SendMessage();
//        sndMsg.sendToTelegram(" Telegram");
//        System.out.println(ldtFormatted);
      }

    static int[] decodeString(String s)// bet 1..8 1 sum num
      {
        String[] sArr = s.split(" ");
        int bet[] = new int[sArr.length - 1];
        for (int i = 1; i < sArr.length; i++)
        {
            bet[i - 1] = Integer.parseInt(sArr[i]);
        }
        return bet;
      }
}
