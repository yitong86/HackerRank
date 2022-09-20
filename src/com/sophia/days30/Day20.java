package com.sophia.days30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day20 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        int n = a.size() - 1;
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a.get(i) > a.get(j)) {

                    Collections.swap(a, i, j);


                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));
    }
}

