package com.sophia.days30;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Day25 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int T = in.nextInt();

            for (int i = 0; i < T; i++) {
                int n = in.nextInt();

                if (n >= 2 && isPrime(n))
                    System.out.println("Prime");
                else System.out.println("Not prime");
            }

            in.close();
        }
        public static boolean isPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
