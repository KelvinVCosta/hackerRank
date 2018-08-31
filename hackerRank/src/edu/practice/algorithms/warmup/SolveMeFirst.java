package edu.practice.algorithms.warmup;

import java.util.*;

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
      return a+b;
	}

 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        in.close();
        System.out.println(solveMeFirst(a,b));
	}
}