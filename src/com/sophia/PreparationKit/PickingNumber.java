package com.sophia.PreparationKit;

import java.util.Collections;
import java.util.List;

public class PickingNumber {

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);//[1,1,2,2,4,4,5,5,5]
        int maxLength = 0;
        for (int i = 0; i < a.size(); i++) {//i=0->1 i=1->1
            int presentLength = 1;
            for (int j = i + 1; j < a.size(); j++) {//j=1-> 1 j=2->2
                if (Math.abs(a.get(i) - a.get(j)) <= 1) {//1-1<=1
                    presentLength++;//2
                }
            }
            maxLength = maxLength > presentLength ? maxLength : presentLength;
        }
        return maxLength;
    }
}
//
//    public static int pickingNumbers(List<Integer> a) {
//        // Write your code here
//        int[] freq = new int[101];
//        for(Integer i:a){
//            freq[i]++;
//        }
//        int max = -1;
//        for(int i = 0;i<101;i++){
//            if(freq[i]==0) continue;
//            if(freq[i] + freq[i+1]>max){
//                max = freq[i]+freq[i+1];
//            }
//        }
//        return max;
//    }
//
//}
