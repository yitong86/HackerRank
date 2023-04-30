package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MiniMaxSum {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
                Collections.sort(arr);
                long minSum = 0;
                long maxSum = 0;
                long sum = 0;
                for(int i = 0;i<arr.size();i++){
                    sum += arr.get(i);
                    minSum = sum - arr.get(arr.size()-1);
                    maxSum = sum - arr.get(0);
                }
                System.out.println(minSum + " " + maxSum);

            }

        }

//            int min = arr.get(0);
//            int max = arr.get(0);
//            long sum = 0;
//            for(int i = 0;i<arr.size();i++){
//                sum +=arr.get(i);
//                if(arr.get(i)<min){
//                    min = arr.get(i);
//                }
//                if(arr.get(i)>max){
//                    max = arr.get(i);
//                }
//            }
//            System.out.print(sum-max + " ");
//            System.out.print(sum-min);
//
//        }



