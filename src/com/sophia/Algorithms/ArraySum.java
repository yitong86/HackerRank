package com.sophia.Algorithms;

import java.util.List;

public class ArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sumArr = 0;
        for(int i = 0;i <ar.size();i++){
            sumArr +=ar.get(i);
        }
        return sumArr;
    }


}
