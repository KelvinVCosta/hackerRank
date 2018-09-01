package edu.practice.java.strings;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class StringReverse {

    static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    static String checkPalindrome(String str, String reverse) {
        return reverse.equals(str) ? "Yes" : "No";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str, reverse(str)));

    }
}
