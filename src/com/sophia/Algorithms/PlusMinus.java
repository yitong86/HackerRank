package com.sophia.Algorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class PlusMinus {


        public static void plusMinus(List<Integer> arr) {
            // Write your code here
            float sumPositive = 0;
            float sumNegative =0;
            float zero = 0;
            for(int i = 0;i < arr.size();i++){
                if(arr.get(i)>0){
                    sumPositive++;
                }else if(arr.get(i)<0){
                    sumNegative++;
                }else{
                    zero++;
                }
            }
            System.out.println(sumPositive/arr.size());
            System.out.println(sumNegative/arr.size());
            System.out.println(zero/arr.size());
        }

    }
