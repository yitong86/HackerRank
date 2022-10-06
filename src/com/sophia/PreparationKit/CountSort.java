package com.sophia.PreparationKit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSort {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        int[] frequencyArray = new int[100];
        Arrays.fill(frequencyArray,0);
        for(Integer a :arr){
            frequencyArray[a]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0;i < 100;i++){
            result.add(frequencyArray[i]);
        }
        return result;
    }



}
