package edu.practice.java.bignumber;

import java.math.BigInteger;
import java.util.*;

public class PrimalityTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger n = SCANNER.nextBigInteger();
        SCANNER.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
