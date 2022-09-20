package com.sophia.days30;

public class Day29 {
    // Write your code here


    public static int bitwiseAnd(int N, int K) {
        // Write your code here


        int maxed = 0;
        for (int b = 2; b <= N; b++) {
            for (int a = 1; a < b; a++) {
                if (a == b) continue;
                int ab = a&b;
                if (ab > maxed && ab < K) maxed = ab;
            }
        }
        return maxed;
    }
}

