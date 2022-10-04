package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io .*;
import java.math .*;
import java.security .*;
import java.text .*;
import java.util .*;
import java.util.concurrent .*;
import java.util.regex .*;


public class LonelyInteger {



        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int number = 0;
        for(Integer i :a){
            if(!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        for(Integer s :set){
            number = s;
        }
        return number;
    }

}


//
//
//        /*
//         * Complete the 'lonelyinteger' function below.
//         *
//         * The function is expected to return an INTEGER.
//         * The function accepts INTEGER_ARRAY a as parameter.
//         */
//
//        public static int lonelyinteger(List<Integer> a) {
//            // Write your code here
//            int number=a.get(0);
//            for(int i=1;i<a.size();i++){
//                number ^=a.get(i);
//            }
//            return number;
//        }
//
//    }






