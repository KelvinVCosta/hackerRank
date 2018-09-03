package edu.practice.java.strings;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Tokens {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String s = scan.nextLine();
            String[] items = s.trim().split("[ !,?.\\_'@]+");

            if ("".equals(s.trim())) {
                out.println("0");
            } else {
                out.println(items.length);
                for (String item : items) {
                    out.println(item);
                }
            }
        }
    }
}
