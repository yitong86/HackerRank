package com.sophia.java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

    //Write your code here
    class MyRegex{
        String s="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String pattern=s+"."+s+"."+s+"."+s;
    }
//        The IP address is a string in the form “A.B.C.D”, where the value of A, B, C, and D may range from 0 to 255.
//        Leading zeros are allowed. The length of A, B, C, or D can’t be greater than 3.
//
//        ReGex to numbers from 0 to 255
//        zeroTo255 -> (\\d{1, 2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])
//
//\d denotes the regular expression to represent number from o to 9.
//        \\d{1, 2} represents any 1 or 2 digits number.
//        (0|1)\\d{2} represents a three digit number which is starting from 0 or 1.
//        2[0-4]\\d represents numbers between 200 and 249.
//        25[0-5] represents number between 250 and 255.
//https://www.javatpoint.com/java-ip-address-ipv4-regex-examples