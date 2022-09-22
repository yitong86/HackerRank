package com.sophia.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaEndFile {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int line = 1;
            while(sc.hasNext()){
                System.out.println(line + " " + sc.nextLine());
                line++;
            }
            sc.close();
        }
    }

