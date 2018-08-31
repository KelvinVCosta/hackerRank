package edu.practice.java.introduction;

import java.util.Scanner;

public class InOut2 {

    static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

        int i = SCAN.nextInt();
        Double d = SCAN.nextDouble();
        SCAN.nextLine(); //Had to use this due nextDouble does not consume the breakline 
        String s = SCAN.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
