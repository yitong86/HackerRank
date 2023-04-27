package com.sophia.neetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
// method 2
//        if (s.length() != t.length())
//            return false;
//            int[] charCount = new int[26];
//            for (int i = 0; i < s.length(); i++) {
//                charCount[s.charAt(i) - 'a']++;
//                charCount[t.charAt(i) - 'a']--;
//            }
//            for (int count : charCount) {
//                if (count != 0) {
//                    return false;
//                }
//            }
//            return true;


    }
}
