package com.sophia.Algorithms;

import java.util.List;

public class ArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int i = 0;i <ar.size();i++){
            sum +=ar.get(i);
        }
        return sum;
    }


}
