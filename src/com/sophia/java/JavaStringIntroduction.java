package com.sophia.java;
import java.io.*;
import java.util.*;
public class JavaStringIntroduction {


        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int sum = A.length()+B.length();
            System.out.println(sum);
            //The result is positive if the first string is lexicographically greater than the second string else the result would be negative
            int i = A.compareTo(B);
            if(i > 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }



            System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+ B.substring(0, 1).toUpperCase()+B.substring(1));
        }
    }


