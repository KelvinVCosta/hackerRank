package edu.practice.java.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        String sortedA = toSortedArray(a.toLowerCase());
        String sortedB = toSortedArray(b.toLowerCase());
        return sortedA.equals(sortedB);
    }

    static String toSortedArray(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }

    public static void main(String[] args) {
        String a;
        String b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.next();
            b = scan.next();
        }

        String result = isAnagram(a, b) ? "Anagrams" : "Not Anagrams";
        System.out.println(result);
    }
}
