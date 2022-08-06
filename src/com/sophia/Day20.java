package com.sophia;

import java.util.ArrayList;
import java.util.List;

public class Day20 {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a.get(i) > a.get(j)) {
                    int temp = a.get(i);
                    a.get(i) = a.get(j);

                    a.get(j) = temp
                }
            }
        }
    }
    }

