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

public class SubarrayDivision2 {


   // class Result {



        public static int birthday(List<Integer> s, int d, int m) {
            // Write your code here
            int counter = 0;
            for(int i=0; i<= s.size()-m; i++){
                int sum = 0;
                for(int j=i; j < i+m; j++){
                    sum+=s.get(j);
                }
                if(sum == d){
                    counter++;
                }
            }
            return counter;
        }
    }

