package edu.practice.java.introduction;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class DateTime {

    private static String getDay(String day, String month, String year){
        System.out.println("Inside: " + day + " " + month + " " + year);
        Calendar cal = new GregorianCalendar(
                Integer.parseInt(year), 
                Integer.parseInt(month)-1, 
                Integer.parseInt(day)
        );
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }
    
}
