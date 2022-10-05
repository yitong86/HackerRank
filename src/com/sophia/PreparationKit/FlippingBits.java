package com.sophia.PreparationKit;

public class FlippingBits {

    public static long flippingBits(long n) {
        // Write your code here
        return ~n & 0xFFFFFFFFL;
    }

}

