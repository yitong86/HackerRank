package com.sophia.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        staircase(6);
    }
    //staircase

    public static void staircase(int n) {
        // n = 4   numSymbols  numSpace
        //   #      1             3
        //  ##      2             2
        // ###      3             1
        //####      4             0
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j<n;j++){
//                if(j<n-i-1){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("#");
//                }
//            }
//            System.out.println();
//        }
//
//    }}

        for (int numSymbols = 1; numSymbols <= n; numSymbols++) {
            int numSpace = n - numSymbols;
            for (int i = 0; i < numSpace; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < numSymbols; i++) {
                System.out.print("#");
            }

            System.out.println();
        }

    }
}

