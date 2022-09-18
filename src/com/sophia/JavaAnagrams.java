package com.sophia;

public class JavaAnagrams {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            int a_length = a.length();
            int b_length = b.length();

            if(a_length != b_length) return false;

            a = a.toLowerCase();
            b = b.toLowerCase();

            int[] char_frequencies = new int[26];

            for(int i =0; i< a .length();i++){
                char current_char = a.charAt(i);
                int index = current_char-'a';
                char_frequencies[index]++;
            }
            for(int i =0; i< b .length();i++){
                char current_char = b.charAt(i);
                int index = current_char-'a';
                char_frequencies[index]--;
            }
            for(int i = 0;i<26;i++){
                if(char_frequencies[i] != 0)return false;

            }
            return true;
        }

