package edu.practice.java.strings;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
class UsernameValidator {

    public static final String regularExpression = "^[aA-Zz]\\w{7,29}$";
}

//main já criado e não passivel de alterações
public class UsernameRegex {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

}
