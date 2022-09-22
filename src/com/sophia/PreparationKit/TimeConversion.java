package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeConversion {


        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            String[] arr =  s.split(":");
            //07:05:45PM
            int hour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);
            String end =  arr[arr.length -1];//45pm
            String time = "";//19:05:45

            if(end.charAt(2) == 'P'){
                if(hour == 12){
                    time = s.substring(0,8);
                }else if(hour < 12){//07:05:45PM
                    hour = hour + 12;//19
                    time = String.format("%02d", hour) + s.substring(2, 8);//19:05:45
                }
            }
            else if(end.charAt(2) == 'A'){
                if(hour < 12){//06:40:03AM 04:59:59
                    time = s.substring(0,8);

                }else if(hour == 12){//12:01:00AM
                    hour = 0;
                    time = String.format("%02d", hour) + s.substring(2, 8);
                }
            }
            //System.out.println(hour);
            //System.out.println(minute);
            // System.out.println(end);
            //07:05:45PM
            return time;
        }

    }





