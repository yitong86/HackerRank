package com.sophia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> scores = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;
        for (int i = 0;i < a.size();i++){
            if(a.get(i) > b.get(i)){
                sumA+=1;
            }else if(a.get(i) < b.get(i)){
                sumB+=1;
            }
        }
        scores.add(sumA);
        scores.add(sumB);
        return scores;

    }

}
//    Sample Input 1
//
//        17 28 30
//        99 16 8
//        Sample Output 1
//
//        2 1