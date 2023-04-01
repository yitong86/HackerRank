package com.sophia.lambdaExpressions;



@FunctionalInterface
public interface MyFirstFunctionalInterface {
   // public void firstWork();
    int sum(int a,int b);

    default int multiply(int a,int b){
        return a * b;
    }
}
