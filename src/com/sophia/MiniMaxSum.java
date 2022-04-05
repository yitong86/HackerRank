package com.sophia;

import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        long biggest =arr.get(0);
        long smallest = arr.get(0);

        for (int i = 0;i <arr.size();i++){
            sum = sum + arr.get(i);
            if(arr.get(i) > biggest){
                biggest = arr.get(i);
            }else if(arr.get(i)<smallest){
                smallest = arr.get(i);
            }
        }


        System.out.println((sum - biggest) + " " + (sum - smallest));


    }

}
//arr =[1,3,5,7,9]
//minimum = 1+3+5+7=16  totalsum - biggest
//maxmum = 3+5+7+9=24   totalsum - smallest


