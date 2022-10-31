package com.sophia.PreparationKit;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1>v2){
            int remindar = (x2-x1)%(v1-v2);
            if(remindar ==0){
                return "YES";
            }
        }return "NO";

    }

}
//j= jump
//v=d/t=d/j
//d=vj
//x1+v1*j = x2+ v2*j
//v1j-v2j = x2-x1
//j(v1-v2) = x2-x1
//j = x2-x1/v1-v2
//r= x2-x1 % v1-v2 = 0
//
