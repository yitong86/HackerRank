package com.sophia;

public class Main {

    public static void main(String[] args) {
        // write your code here
        staircase(6);
    }
    //staircase

    public static void staircase(int n) {
        // Write your code here
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

