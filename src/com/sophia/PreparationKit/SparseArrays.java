package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class SparseArrays {




        /*
         * Complete the 'matchingStrings' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. STRING_ARRAY strings
         *  2. STRING_ARRAY queries
         */

        public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
            // Write your code here
            List<Integer> result = new ArrayList<Integer>();

            for(int i=0;i<queries.size();i++)
                result.add(Collections.frequency(strings,queries.get(i)));

            return result;
        }

    }

