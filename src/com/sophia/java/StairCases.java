package com.sophia.java;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class StairCases {

        /*
         * Complete the 'staircase' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void staircase(int n) {
            // Write your code here
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < n - i - 1)
                        System.out.print(" ");
                    else
                        System.out.print("#");
                }
                // Display in a new line
                System.out.println();
            }
        }

}
