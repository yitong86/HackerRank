package com.sophia.Algorithms;

import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long minimumSum = 0;
        long maxmumSum =0;
        for(int i = 0;i <arr.size()-1;i++){
            minimumSum += arr.get(i);
        }
        for(int j = arr.size()-1;j>0;j--){
            maxmumSum += arr.get(j);
        }
        System.out.println(minimumSum + " " + maxmumSum);
    }

}