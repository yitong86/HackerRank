package com.sophia.PreparationKit;

import javax.xml.transform.Result;
import java.awt.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BreakingRecords {


        public static List<Integer> breakingRecords(List<Integer> scores) {
            // Write your code here//10 5 20 20 4 5 2 25 1
            int max = scores.get(0);
            int min = scores.get(0);
            int countMin = 0;
            int countMax = 0;
            for (int i = 1;i < scores.size();i++){
                if(scores.get(i) > max){
                    max = scores.get(i);
                    countMax++;
                }
                if(scores.get(i) < min){
                    min = scores.get(i);
                    countMin++;
                }
            }
            ArrayList<Integer> counter = new ArrayList<>();
            counter.add(countMax);
            counter.add(countMin);
            return counter;
        }

    }


