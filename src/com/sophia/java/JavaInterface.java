package com.sophia.java;
import java.util.*;

public class JavaInterface {

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    //Write your code here
    class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {//n = 6, i = 1
                if (n % i == 0) {//6%1 6%2,6%3,
                    sum += i;
                }
            }
            return sum;
        }
    }
}

