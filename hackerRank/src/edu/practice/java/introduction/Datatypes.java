package edu.practice.java.introduction;

import java.util.*;

class Datatypes {

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                int count = 0;
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    count++;
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    count++;
                    System.out.println("* short");
                }
                if (x >= -(Math.pow(2, 31)) && x <= Math.pow(2, 31) - 1) {
                    count++;
                    System.out.println("* int");
                }
                if (x >= -(Math.pow(2, 63)) && x <= Math.pow(2, 63) - 1) {
                    count++;
                    System.out.println("* long");
                }
                if (count == 0) {
                    System.out.println(x + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
