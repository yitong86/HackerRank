package com.sophia.PreparationKit;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
// Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < s.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= s.charAt(i)
                    && s.charAt(i) <= 'Z')
                index = s.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if ('a' <= s.charAt(i)
                    && s.charAt(i) <= 'z')

                index = s.charAt(i) - 'a';

                // If this character is other than english
                // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return "not pangram";

        // If all characters were present
        return "pangram";
    }
}