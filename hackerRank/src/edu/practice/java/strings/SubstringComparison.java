package edu.practice.java.strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Kelvin
 */
public class SubstringComparison {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        SortedSet<String> sets = new TreeSet<>();
        for (int i = 0; i <= str.length() - k; i++) {
            sets.add(str.substring(i, i + k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }

}
