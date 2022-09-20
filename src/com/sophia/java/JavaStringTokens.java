package com.sophia.java;
import java.io.*;
import java.util.*;

public class JavaStringTokens {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.

            // [A-Za-z !,?._'@]+
            //The +, known as occurrence indicator (or repetition operator), indicates one or more occurrences (1+) of the previous sub-expression. In this case, [0-9]+ matches one or more digits.

            //s = "He is a very very good boy, isn't he?"

            //specail case
            s = s.trim();
            if (s.length() == 0) {
                System.out.println(0);
                return;
            }

            /* Split on all non-alphabetic characters */
            String[] words = s.split("[^a-zA-Z]+");

            /* Print output */
            System.out.println(words.length);
            for (String word : words) {
                System.out.println(word);
            }
        }
    }



