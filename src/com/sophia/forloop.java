package com.sophia;
import java.util.*;
import java.io.*;
public class forloop {



        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                double sum = a;
                //sum = sum + Math.pow(2,j)*b
                for(int j = 0 ;j <n;j++){//j=0 sum = a + 2^0 *b
                    sum = sum + Math.pow(2,j) * b;

                    System.out.print(Math.round(sum)+" ");
                }
                System.out.print("\n");

            }
            in.close();
        }
    }


