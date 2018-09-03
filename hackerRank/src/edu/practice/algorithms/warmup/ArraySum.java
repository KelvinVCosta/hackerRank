package edu.practice.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class ArraySum {

    static int[] getArrayValues() {
        int size;
        String[] values;
        try (Scanner scan = new Scanner(System.in)) {
            size = Integer.parseInt(scan.nextLine());
            values = scan.nextLine().split(" ");
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(values[i]);
        }
        return array;
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = getArrayValues();
        System.out.println(sumArray(array));
    }

}
