package com.sophia;
import java.util.Scanner;
public class JavaStdin2 {


    public class Solution {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();

            // Write your code here.
            Double d = scan.nextDouble();
            String s =scan.nextLine();
            s = scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }
}
