package com.sophia.java;
import java.util.*;
import java.security.*;
public class JavaIntToString {
        public static void main(String[] args) {

            try {
                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                in.close();
                //String s=???; Complete this line below

                //Write your code here

                String s = Integer.toString(n);

                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            } catch (Exception e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }
    }

    //The following class will prevent you from terminating the code using exit(0)!



