package com.sophia.java;
import java.util.Map;
import java.util.HashMap;

public class IteratHashmap {




        public static void main(String[] arg)
        {
            Map<String,String> gfg = new HashMap<String,String>();

            // enter name/url pair
            gfg.put("GFG", "geeksforgeeks.org");
            gfg.put("Practice", "practice.geeksforgeeks.org");
            gfg.put("Code", "code.geeksforgeeks.org");
            gfg.put("Quiz", "quiz.geeksforgeeks.org");

            // using keySet() for iteration over keys
            for (String name : gfg.keySet())
                System.out.println("key: " + name);

            // using values() for iteration over values
            for (String url : gfg.values())
                System.out.println("value: " + url);
        }

}
