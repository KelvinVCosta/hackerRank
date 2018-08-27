package introduction;

import java.util.Scanner;

public class InOut {

    public void readPrint() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println(scan.nextInt());
        }
    }
}
