package com.sophia;

public class SuperReducedString {

    public static String superReducedString(String s) {
        // Write your code here

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    //
                    s = s.substring(0, i - 1) + s.substring(i + 1);
                    i = 0;//i++

                }
            }
            if (s.isEmpty()) {
                return "Empty String";
            }

            return s;
        }

    }
}