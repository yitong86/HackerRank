package com.sophia.PreparationKit;

import java.util.List;
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


public class BetweenTwoSets {

//    a={2,6} 2->2,4,6,8,10,12...6->6 12 18 24 max a倍数
//    b={24,36} 24->2,3,4,6,8 36->2,3,4,6,9,12,18 min b整除
            public static int gcd(int x,int y){
                if(y==0){
                    return x;
                }else{
                    return gcd(y,x%y);
                }
            }
            public static int lcm(int x ,int y){
                return(x*y)/gcd(x,y);
            }
            public static int getTotalX(List<Integer> a, List<Integer> b) {
                // Write your code here
                int result = 0;

                int gcd = b.get(0);
                for(Integer integer:b){
                    gcd = gcd(gcd,integer);
                }

                int lcm = a.get(0);
                for(Integer integer:a){
                    lcm = lcm(lcm,integer);
                }

                int multiple =0;
                while(multiple <= gcd){
                    multiple +=lcm;
                    if(gcd % multiple == 0){
                        result++;
                    }

                }
                return result;
            }

        }

//        public class Solution {
//            public static void main(String[] args) throws IOException {
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                int n = Integer.parseInt(firstMultipleInput[0]);
//
//                int m = Integer.parseInt(firstMultipleInput[1]);
//
//                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                int total = Result.getTotalX(arr, brr);
//
//                bufferedWriter.write(String.valueOf(total));
//                bufferedWriter.newLine();
//
//                bufferedReader.close();
//                bufferedWriter.close();
//            }
//        }
