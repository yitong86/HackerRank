package com.sophia.java;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.math.*;

public class BigInteger {

    //public class Solution {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            java.math.BigInteger A = input.nextBigInteger();
            java.math.BigInteger B = input.nextBigInteger();

            System.out.println(A.add(B));
            System.out.println(A.multiply(B));
        }
    }



