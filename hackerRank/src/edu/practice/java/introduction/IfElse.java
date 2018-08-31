package edu.practice.java.introduction;

import java.util.*;

public class IfElse {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String weirdNumbers(int n) {
        String resp;
        if (n % 2 != 0) {
            resp = "Weird";
        } else if (inRange(n, 2, 5)) {
            resp = "Not Weird";
        } else if (inRange(n, 6, 20)) {
            resp = "Weird";
        } else {
            resp = "Not Weird";
        }
        SCANNER.close();
        return resp;
    }

    /**
     * Checks if n is in the inclusive range of min to max
     *
     * @param number
     * @param min
     * @param max
     * @return true if inclusive, false if not
     */
    private static boolean inRange(int number, int min, int max) {
        return (number >= min && number <= max);
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(weirdNumbers(n));
        SCANNER.close();
    }
}
