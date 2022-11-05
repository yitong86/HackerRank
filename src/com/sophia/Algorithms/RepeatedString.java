package com.sophia.Algorithms;

public class RepeatedString {
    public static long countCharacter(String s, long n){
        long count=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='a')
                count++;
        }
        return count;
    }

    public static long repeatedString(String s, long n) {
        long size = s.length();
        long reminder = n % size;
        long multiple= n /  size;

        return countCharacter(s, size)*multiple+countCharacter(s, reminder);
    }

}
