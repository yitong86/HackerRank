package com.sophia.neetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> complements = new HashMap<>();

        for (int i = 0;i< nums.length;i++){
           int complement = target - nums[i];
           if(complements.containsKey(complement)){
               return new int[]{complements.get(complement),i};
           }
            complements.put(nums[i],i);
        }
        return nums;
    }
//        for (int i = 0;i< nums.length;i++){
//            for (int j =i+1;j<nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//
//        }
//        return nums;
//    }
}

