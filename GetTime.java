/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alex
 */
public class GetTime
{
    public static String getTime(){
        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.minusMinutes(5);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String ldtFormatted = ldt.format(myFormatObj);
        return ldtFormatted;
    }
}
