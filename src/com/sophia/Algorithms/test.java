package com.sophia.Algorithms;
import java.io .*;
import java.util .*;
import java.text .*;
import java.math .*;
import java.util.regex .*;
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

public class test {




    //class Result

        public static int raisingPower(List<Integer> arr) {
            int result = 0;//[1,2,3]
            ArrayList<Integer> array = new ArrayList<>();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i = 0;i<arr.size()-2;i++){
                result = (int) Math.pow(arr.get(i),arr.get(i+1)) % (int) Math.pow(10,9) +7;
                array.add(result);

                map.put(i+1,result);
            }

            int maxValueInMap = (Collections.max(map.values()));


            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Iterate through HashMap
                if (entry.getValue()==maxValueInMap) {
                    System.out.println(entry.getKey());     // Print the key with max value
                }
            }

        }

    }
