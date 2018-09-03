package edu.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author Kelvin
 */
public class SyntaxChecker {

    static boolean checker(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException ex) {
            return false;
        }      
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            System.out.println(checker(pattern) ? "Valid" : "Invalid");
            testCases--;
        }
    }
}
