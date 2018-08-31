package edu.practice.java.introduction;

import java.util.Scanner;

public class OutputFormatting {

    static final String BORDER_LINE = "================================";

    private static String getTableValues() {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();
            sb.append(String.format("%-15s", str)).append(String.format("%03d", num));
            if(inRange(i, 0, 1)){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static boolean inRange(int n, int min, int max) {
        return (n >= min && n <= max);
    }

    public static void main(String[] args) {

        String tableValues = getTableValues();

        System.out.println(BORDER_LINE);
        System.out.println(tableValues);
        System.out.println(BORDER_LINE);

    }
}
