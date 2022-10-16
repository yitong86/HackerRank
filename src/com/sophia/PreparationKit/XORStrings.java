package com.sophia.PreparationKit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class XORStrings {


   // public class Solution {

        public static String stringsXOR(String s, String t) {
            String res = new String("");
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == t.charAt(i))
                    //10101
                   // 00101
                    res = res + '0';//0 0 0 0
                else
                    res = res + '1';//1
            }

            return res;//10000
        }

    }
