package com.sophia.java;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.io.*;
public class PrimalityTest {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger a = new BigInteger(n);
        boolean result;
        result = a.isProbablePrime(100);
        if (result == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        bufferedReader.close();
    }


}