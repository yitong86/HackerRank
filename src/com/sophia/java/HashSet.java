package com.sophia.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSet {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }

//Write your code here
            Set<String> pairs = new java.util.HashSet<>();

            for(int i = 0; i < t; i++)
            {
                pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")" );
                System.out.println(pairs.size());

            }
            Iterator<String> itr = pairs.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }

        }
    }