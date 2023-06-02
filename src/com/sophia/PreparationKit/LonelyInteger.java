package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io .*;
import java.math .*;
import java.security .*;
import java.text .*;
import java.util .*;
import java.util.concurrent .*;
import java.util.regex .*;


public class LonelyInteger {


    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int Lonelynumber = 0;
        for(Integer i :a){
            if(!set.contains(i)){
                set.add(i);
            }else{
                set.remove(i);
            }
        }
        for(Integer s :set){
            Lonelynumber = s;
        }
        return Lonelynumber;
    }

}


