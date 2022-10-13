package com.sophia.PreparationKit;

import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);//[1,2,3]
        Collections.sort(B, Collections.reverseOrder());
        //[9,8,7]
        for (int i = 0; i < A.size(); i++){

            if (A.get(i) + B.get(i) < k)
                return "NO";

        }


        return "YES";
    }

}
