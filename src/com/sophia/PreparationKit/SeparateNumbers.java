package com.sophia.PreparationKit;

public class SeparateNumbers {

    public static void separateNumbers(String s) {//91011
        String subString = "";
        boolean isBeautiful = false;
        for(int i =1;i<=s.length()/2;i++){//check every possible substring(number) of different length,up to the mid length of the inout string
            subString = s.substring(0,i);//how many digital number
            Long num = Long.parseLong(subString);
            String  beautifulString = subString;
            while(beautifulString.length()<s.length()){
                beautifulString +=Long.toString(++num);//9 910 911
            }
            if(s.equals(beautifulString)){
                isBeautiful = true;
                break;
            }

        }
        System.out.println(isBeautiful?"YES " + subString : "NO");
    }
}
