package com.sophia.lambdaExpressions;

public class MyRunner {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int result = c.fobj.sum(5, 5);
        System.out.println("Result Abstract method" +
                result);
        int result_defaultMethod = c.fobj.multiply(5, 5);
        System.out.println("Result defaultmethod" + result_defaultMethod);

    }
}