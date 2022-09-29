package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DivisibleSum {


        /*
         * Complete the 'divisibleSumPairs' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER k
         *  3. INTEGER_ARRAY ar
         */

        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
            int count = 0;
            for(int i = 0;i<n;i++){
                for (int j = i+1; j < n;j++){
                    int sum = ar.get(i)+ ar.get(j);
                    if(sum % k == 0 ){
                        count++;
                    }

                }
            }
            return count;
        }

    }