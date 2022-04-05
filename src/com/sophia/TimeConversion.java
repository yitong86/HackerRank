package com.sophia;

public class TimeConversion {
    public static String timeConversion(String s) {
        String strHour="";

//        12:01:00pm Return '12:01:00'.
//        12:01:00am Return '00:01:00'.
        if(!s.substring(0,2).equals("12") && s.contains("PM")){
            strHour= Integer.toString(Integer.parseInt(s.substring(0,2))+12);
            s = strHour + s.substring(2,s.length());
        }
        if(s.substring(0,2).equals("12")&&s.contains("AM")){
            strHour = "00";
            s = strHour + s.substring(2,s.length());
        }
        //just take the number
        return s.substring(0,s.length()-2);
    }
}

//    Sample Input 0
//
//        07:05:45PM
//        Sample Output 0
//
//        19:05:45
