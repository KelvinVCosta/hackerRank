package edu.practice.java.strings;
/**
 * @author Kelvin
 */

import java.util.*;

public class Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        String C = A.substring(0, 1).toUpperCase() + A.substring(1);
        String D = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(C + " " + D);
    }
}
