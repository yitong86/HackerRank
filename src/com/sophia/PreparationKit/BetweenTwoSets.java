package com.sophia.PreparationKit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> arr = new ArrayList<>();
//    a={2,6} 2->2,4,6,8,10,12...6->6 12 18 24 max a倍数
//    b={24,36} 24->2,3,4,6,8 36->2,3,4,6,9,12,18 min b整除
        Collections.sort(a);
        Collections.sort(b);
        int maxMulti = a.get(a.size()-1);
         int minFact = b.get(0);
         for(Integer num:)
         if(maxMulti % 2 == 0 ){
             arr.add(num);
         }

    }
}
