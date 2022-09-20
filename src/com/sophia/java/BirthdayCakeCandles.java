package com.sophia.java;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int higgest = 0;
        int count = 0;
        for(int i = 0 ;i<candles.size();i++){
            if(candles.get(i) > higgest ){
                higgest = candles.get(i);
                count=1;
            }else if(candles.get(i) == higgest){
                count+=1;
            }
        }
        return count;
    }

}