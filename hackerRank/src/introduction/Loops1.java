package introduction;

import java.util.*;

public class Loops1 {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static int getMultiplier() {
        int number = SCANNER.nextInt();
        SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        SCANNER.close();
        return number;
    }
    
    private static void printMultTable(int multiplier){
        for(int i = 1; i < 11; i++){
            System.out.println(multiplier + " x " + i + " = " + multiplier * i);
        }
    }

    public static void main(String[] args) {
        printMultTable(getMultiplier());
    }
}
