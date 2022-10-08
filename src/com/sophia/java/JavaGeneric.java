package com.sophia.java;
import java.io.*;
import java.util.*;
import java.lang.reflect.Method;

public class JavaGeneric {


    class Printer<T> {
        public <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    public class Solution {
        public void main(String args[]) {
            Printer<Integer> myPrinter = new Printer();
            Printer<String> myPrinter1 = new Printer();

            Integer[] intArray = {1, 2, 3};
            String[] stringArray1 = {"Hello", "World"};
            myPrinter.printArray(intArray);
            myPrinter1.printArray(stringArray1);




           // Printer myPrinter = new Printer();
            // //Integer[] intArray = { 1, 2, 3 };
            // String[] stringArray = { "Hello", "World" };
            // myPrinter.printArray(intArray);
            // myPrinter.printArray(stringArray);

            int count = 0;
            for (Method method : Printer.class.getDeclaredMethods()) {
                String name = method.getName();
                if (name.equals("printArray"))
                    count++;
            }

            if (count > 1)
                System.out.println("Method overloading is not allowed!");
            assert count == 1;

        }
    }
}
