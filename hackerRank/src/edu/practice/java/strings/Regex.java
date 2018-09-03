package edu.practice.java.strings;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Regex {

    //main já criado no exercicio e não passivel de alteração
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

    static class MyRegex {

        public final String pattern = "^((\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])$";

        public MyRegex() {
        }

    }

}
