package com.sophia.java;
import java.util.*;

public class JavaStack {

    class Solution {


        public static String isBlanced(String s) {


            Stack<Character> stack = new Stack<>();
            //{}(
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                    if (stack.isEmpty()) {
                        return "false";
                    } else {//}
                        //System.out.println(stack);
                        char popValue = stack.pop();
                        // System.out.println(popValue);
                        if (s.charAt(i) == '}' && popValue != '{') {
                            return "false";

                        } else if (s.charAt(i) == ')' && popValue != '(') {
                            return "false";
                        } else if (s.charAt(i) == ']' && popValue != '[') {
                            return "false";
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                return "true";
            } else {
                return "false";
            }
        }

        public static void main(String[] argh) {
            Scanner sc = new Scanner(System.in);

            while (sc.hasNext()) {
                String input = sc.next();
                //Complete the code
                System.out.println(isBlanced(input));
            }

        }
    }
}





