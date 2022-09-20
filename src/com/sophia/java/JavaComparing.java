package com.sophia.java;
import java.util.Scanner;
public class JavaComparing {

        public static String getSmallestAndLargest(String s, int k) {
            //welcometojava k = 3
            String str = s.substring(0, k);//wel
            String smallest = str;
            String largest = str;

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'
            for (int i = 1;i<=s.length()-k;i++){//i = 1 "e" i<13-3=10
                str=s.substring(i, i+k);//elc,lco,com
                if(str.compareTo(smallest)<0){
                    smallest=str;
                }
                if(str.compareTo(largest)>0){
                    largest=str;
                }


            }

            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }

