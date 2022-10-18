package com.sophia.PreparationKit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximunPerimeterTriangle {

  //  class Result {

        /*
         * Complete the 'maximumPerimeterTriangle' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY sticks as parameter.
         */

        public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
            // Write your code here
            Collections.sort(sticks);
            int sum = 0;//[1,1,1,3,3]
            ArrayList<Integer> arr = new ArrayList<>();
            int i = sticks.size()-3;
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
