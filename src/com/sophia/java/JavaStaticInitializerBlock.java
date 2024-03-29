package com.sophia.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaStaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

    }

    public static void main(String[] args) {
    }
}
