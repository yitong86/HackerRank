package com.sophia.PreparationKit;

public class SeparateNumbers {

    public static void separateNumbers(String s) {
        String subString = "";
        boolean isBeautiful = false;
        for(int i =1;i<=s.length()/2;i++){
            subString = s.substring(0,i);
            Long num = Long.parseLong(subString);
            String  beautifulString = subString;
            while(beautifulString.length()<s.length()){
                beautifulString +=Long.toString(++num);
            }
            if(s.equals(beautifulString)){
                isBeautiful = true;
                break;
            }

        }
        System.out.println(isBeautiful?"YES " + subString : "NO");
    }
}
