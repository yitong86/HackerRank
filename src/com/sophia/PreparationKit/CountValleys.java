package com.sophia.PreparationKit;

public class CountValleys {
    public static int countingValleys(int steps, String path) {
        int count = 0;
        int result = 0;
        for(int i = 0;i < steps ;i++){
            if(path.charAt(i) == 'U'){
                if(count == -1){
                    result++;
                }
                count++;
            }else{
                count--;
            }
        }
        return result;
    }

}

