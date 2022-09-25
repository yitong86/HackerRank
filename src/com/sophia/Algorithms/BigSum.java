package com.sophia.Algorithms;

import java.util.List;

public class BigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (int i = 0;i<ar.size();i++){
            sum += ar.get(i);
        }
        return sum;
    }

}

