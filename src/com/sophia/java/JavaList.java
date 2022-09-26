package com.sophia.java;
import java.io.*;
import java.util.*;
public class JavaList {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            ArrayList<Integer> L = new ArrayList<>();
            for (int i = 0;i < n;i++){
                L.add(scanner.nextInt());
            }
            int q = scanner.nextInt();
            for(int i = 0;i < q;i++){
                String s = scanner.next();
                if(s.equals("Insert")){
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    L.add(x,y);

                }else if(s.equals("Delete")){
                    int z = scanner.nextInt();
                    L.remove(z);
                }
            }
            for(int num:L){
                System.out.print(num+" ");
            }
        }
    }