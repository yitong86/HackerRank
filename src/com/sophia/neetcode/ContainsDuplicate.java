package com.sophia.neetcode;

import java.util.Arrays;

public class ContainsDuplicate {

   // class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);//Collections.sort()
            for(int i = 0;i<nums.length-1;i++){

                if(nums[i] == nums[i+1]){

                    return true;
                }
            }
            return false;
        }

    }

