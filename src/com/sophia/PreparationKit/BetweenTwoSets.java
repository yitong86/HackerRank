package com.sophia.PreparationKit;

import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class BetweenTwoSets {

//    a={2,6} 2->2,4,6,8,10,12...6->6 12 18 24 max a倍数
//    b={24,36} 24->2,3,4,6,8 36->2,3,4,6,9,12,18 min b整除
            public static int gcd(int x,int y){
                if(y==0){
                    return x;
                }else{
                    return gcd(y,x%y);
                }
            }
            public static int lcm(int x ,int y){
                return(x*y)/gcd(x,y);
            }
            public static int getTotalX(List<Integer> a, List<Integer> b) {
                // Write your code here
                int result = 0;

                int gcd = b.get(0);
                for(Integer integer:b){
                    gcd = gcd(gcd,integer);
                }

                int lcm = a.get(0);
                for(Integer integer:a){
                    lcm = lcm(lcm,integer);
                }

                int multiple =0;
                while(multiple <= gcd){
                    multiple +=lcm;
                    if(gcd % multiple == 0){
                        result++;
                    }

                }
                return result;
            }

        }

//    List<Integer> numStorage = new ArrayList<>();
//        for(int i = 1;i<=Collections.max(b);i++){
//                boolean flag = true;
//                for(int j = 0;j<a.size();j++){
//        if(i%a.get(j)!= 0){
//        flag = false;
//        break;
//        }
//        }
//        if(flag){
//        numStorage.add(i);
//        }
//        }
//        for(int i = 0;i<b.size();i++){
//        for(int j = 0;j<numStorage.size();j++){
//        if(b.get(i) % numStorage.get(j) != 0){
//        numStorage.remove(j--);
//        }
//        }
//
//        }
//        return numStorage.size();
//        }
//
//        }

