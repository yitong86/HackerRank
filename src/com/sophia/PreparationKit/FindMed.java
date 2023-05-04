package com.sophia.PreparationKit;

import java.util.Collections;
import java.util.List;

public class FindMed {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int med = arr.get(arr.size()/2);
        return med;
    }
}
