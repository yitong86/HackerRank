package com.sophia.lambdaExpressions;

public class Calculator {
    MyFirstFunctionalInterface fobj = new MyFirstFunctionalInterface() {
        @Override
        public int sum(int a, int b) {
            return a +b;
        }
    };
}
