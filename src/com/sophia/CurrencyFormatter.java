package com.sophia;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class CurrencyFormatter {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            // Write your code here.
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
            NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            /* Print output */
            String us = usFormat.format(payment);
            String india = usFormat.format(payment);
            String china = usFormat.format(payment);
            String france = usFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

