package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class PlusMinus {


        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            int positive = 0;
            int negative = 0;
            int zero = 0;
            for(int i = 0;i< arr.size();i++){
                if(arr.get(i)>0){
                    positive++;
                }else if(arr.get(i)< 0){
                    negative++;
                }else{
                    zero++;
                }
            }
            //String.format("%.5g%n", 0.912385)
            System.out.print(String.format("%.6g%n", (double)positive/arr.size()));
            System.out.print(String.format("%.6g%n",(double)negative/arr.size()));
            System.out.print(String.format("%.6g%n",(double)zero/arr.size()));
        }


    }



