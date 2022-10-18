package com.sophia.PreparationKit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximunPerimeterTriangle {

  //  class Result {

        public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
            // Write your code here
            Collections.sort(sticks);
           //[1,1,1,3,3]
            ArrayList<Integer> arr = new ArrayList<>();
            int i = sticks.size()-3;//i=5-3=2
            while(i>=0){
                if(sticks.get(i) + sticks.get(i+1) > sticks.get(i+2)){
                    break;
                }else{
                    i = i-1;
                }
            }
            if(i<0){
                arr.add(-1);
            }else{
                arr.add(sticks.get(i));
                arr.add(sticks.get(i+1));
                arr.add(sticks.get(i+2));
            }
            return arr;
        }

}




//convert array into zigzag



//for(int i = 0;i<N-1;i++){
//    if(i%2 ==0 && A[i]>A[i+1])
//        swwap(A[i],A[i+1])
//        else if(i % 2 ==1 && A[i]<A[i+1])
//            swap(A[i].A[i+1])
//        }
