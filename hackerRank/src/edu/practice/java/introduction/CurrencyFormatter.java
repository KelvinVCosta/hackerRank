package edu.practice.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 670543
 */
public class CurrencyFormatter {

    private static double getValue(){
        double payment;
        try (Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
        }
        return payment;
    }    
    
    private static String formatCurrency(double payment, Locale locale){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(payment);
    }
    
    public static void main(String[] args) {
        double payment = getValue();
        System.out.println("US: " + formatCurrency(payment, Locale.US));
        System.out.println("India: " + formatCurrency(payment, new Locale("en", "IN")));
        System.out.println("China: " + formatCurrency(payment, Locale.CHINA));
        System.out.println("France: " + formatCurrency(payment, Locale.FRANCE));
    }
}