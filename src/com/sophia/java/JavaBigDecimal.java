package com.sophia.java;
import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

   // class Solution{
        public static void main(String []args){
            //Input
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            String []s=new String[n+2];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
            sc.close();

            //Write your code here
            for(int j = n-1; j>0;j--) {
                for (int i = 0; i < j; i++) {
                    BigDecimal curr = new BigDecimal(s[i]);
                    BigDecimal currNext = new BigDecimal(s[i+1]);
                    if (curr.compareTo(currNext) < 0) {
                        String temp = s[i];
                        s[i] = s[i+1];
                        s[i+1] = temp;
                    }
                }
            }
            //Output
            for(int i=0;i<n;i++)
            {
                System.out.println(s[i]);
            }
        }
    }

