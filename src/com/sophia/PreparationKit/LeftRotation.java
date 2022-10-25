package com.sophia.PreparationKit;

import java.util.List;

public class LeftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

            int temp=0;//[1 2 3 4 5]
            for(int i=0;i<d;i++){//d=2 i=0 i=1
                temp = arr.get(0);//temp = 1/2
                // System.out.println(arr);
                arr.remove(0);//1 [2 3 4 5 ] [3 4 5 1 ]
                arr.add(temp);//1 [2 3 4 5 1] [3 4 5 1 2]

            }

            return arr;
        }
    }

