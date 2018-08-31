package edu.practice.java.introduction;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()){
            count++;
            String str = sc.nextLine();
            System.out.println(count + " " + str);
        }
    }
}
