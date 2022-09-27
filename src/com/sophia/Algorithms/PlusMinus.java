package com.sophia.Algorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PlusMinus {


        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            float positive = 0;
            float negative =0;
            float zero = 0;
            for(int i = 0;i < arr.size();i++){
                if(arr.get(i)>0){
                    positive++;
                }else if(arr.get(i)<0){
                    negative++;
                }else{
                    zero++;
                }
            }
            System.out.println(positive/arr.size());
            System.out.println(negative/arr.size());
            System.out.println(zero/arr.size());
        }

    }
