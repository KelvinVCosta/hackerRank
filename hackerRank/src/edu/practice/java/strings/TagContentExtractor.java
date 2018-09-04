package edu.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kelvin
 */
public class TagContentExtractor {

    private static final String REGEX = "";
    private static final Pattern PATT = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start");
        int n = Integer.parseInt(SCAN.nextLine());
        while (n-- != 0) {
            String tag = SCAN.nextLine();
            if (tag.matches(REGEX)) {
                Matcher matcher = PATT.matcher(tag);
                System.out.println(matcher.group());
            }
        }
        System.out.println("End");
    }
}
