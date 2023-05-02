package com.sophia.Algorithms;

public class TimeConversition {
    public static String timeConversion(String s) {
        //07:05:45PM
        String start = s.substring(0,2);//hour "07"
        String end = s.substring(2,8);//s.substring(2,s.length())
        int hour = Integer.parseInt(start);//07
        if(s.contains("P") && hour < 12){
            hour += 12;//07+12=19
            start = String.valueOf(hour);//transfer interger to string

        }else if(s.contains("A") && hour == 12){//hour = 12
            start = "00";
        }
        s = start + end;//new string
        return s;
    }
}
