/**
 * The first line contains an integer, , denoting the number of queries.
 * Each line  of the  subsequent lines contains three space-separated integers
 * describing the respective ai , bi, and ni values for that query.
 *
 * s = ai * bi + ... + an-1 * bn-1
 *
 */
package introduction;

import java.util.*;

class Loops2 {

    private static int[] getQuery(Scanner sc) {
        int[] query = new int[3];
        for (int i = 0; i < 3; i++) {
            query[i] = sc.nextInt();
        }
        return query;
    }

    private static String getSummation(int[] query) {
        int a = query[0],
                b = query[1],
                n = query[2],
                sum = 0;
        StringBuilder sb = new StringBuilder();

        sum += a;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i) * b;
            sb.append(sum).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int qty = sc.nextInt();
        for (int i = 0; i < qty; i++) {
            sb.append(getSummation(getQuery(sc)));
            if (i < qty - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
