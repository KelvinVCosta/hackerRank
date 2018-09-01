package edu.practice.java.strings;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class SubstringComparison {

    static String getSmallestAndLargest(String s, int k) {

        /**
         * SortedSet e TreeSet utilizados com pacote por não poder adicionar
         * imports
         */
        java.util.SortedSet<String> sets = new java.util.TreeSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            sets.add(s.substring(i, i + k));
        }
        return sets.first() + "\n" + sets.last();
    }

    /**
     * Main já criado no exercicio e não passivel de alteração
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

}
