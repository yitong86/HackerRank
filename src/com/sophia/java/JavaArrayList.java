package com.sophia.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaArrayList {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            List<List<Integer>> listOfList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            // System.out.println(n);

            for (int i = 0;i < n;i++){//n =5 element
                int d = scanner.nextInt();
                //System.out.println(d);//5 41 77 74 22 44
                List<Integer> list = new ArrayList<>();
                for (int j = 0;j < d;j++){
                    list.add(scanner.nextInt());
                    // System.out.print(scanner.nextInt() +" ");
                }
                listOfList.add(list);
            }
            int q = scanner.nextInt();
            for(int i = 0;i < q;i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                try{
                    System.out.println( listOfList.get(x-1).get(y-1));
                }catch(Exception e){
                    System.out.println("ERROR!");
                }

            }

        }
    }