package com.sophia.Algorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Algorithms {


        /*
         * Complete the 'compareTriplets' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY a
         *  2. INTEGER_ARRAY b
         */

        public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            int aScore = 0;
            int bScore = 0;
            int size = a.size();
            ArrayList<Integer> array = new ArrayList<>();
            for (int i = 0;i<size;i++){
                if(a.get(i)>b.get(i)){
                    aScore++;
                }else if(a.get(i) < b.get(i)){
                    bScore++;
                }
            }
            array.add(0,aScore);
            array.add(1,bScore);
            return array;
        }


}
