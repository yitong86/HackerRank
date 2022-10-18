package com.sophia.PreparationKit;

import java.util.HashSet;
import java.util.List;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashSet<Integer> m = new HashSet<Integer>();
        for(int i=0; i<ar.size(); i++){
            if (m.contains(ar.get(i))){
                m.remove(ar.get(i));
            }else {
                m.add(ar.get(i));
            }
        }


        return (n-m.size())/2;

    }

}


//    public static int sockMerchant(int n, List<Integer> ar) {
//        // Write your code here
//        Collections.sort(ar);
//        int count = 1;
//        int pair = 0;
//        for(int i = 0;i<ar.size()-1;i++){
//            if(ar.get(i) == ar.get(i+1)){
//                count++;
//                if(count % 2){
//                    pair++;
//
//                }
//            }else{
//                count = 1;
//            }
//
//        }
//        return pair;
//    }
//
//}
