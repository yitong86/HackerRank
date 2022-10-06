package com.sophia.PreparationKit;
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

public class DiagonalDiff {


        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here
            int a = 0, b = 0;
            for(int i = 0; i < arr.size(); i++){
                for(int j = 0; j < arr.get(i).size(); j++){
                    if(i == j){
                        a += arr.get(i).get(j);
                    }
                    if((i + j) == (arr.size() - 1)){
                        b += arr.get(i).get(j);
                    }
                }
            }
            return (a > b) ? a - b : b - a;
        }

    }
