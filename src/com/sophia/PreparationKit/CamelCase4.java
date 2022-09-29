package com.sophia.PreparationKit;
import java.io .*;
import java.util .*;
import java.text .*;
import java.math .*;
import java.util.regex .*;

public class CamelCase4 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            ArrayList<String> in = new ArrayList<String>();
            while (sc.hasNextLine() == true) {
                in.add(sc.nextLine());
                //infinite loop
            }
            int k = 0;
            while (k < in.size()) {
                String str = in.get(k++);
                String[] s = str.split(";");
                String temp = s[2];
                if (s[0].equals("S")) {
                    temp = temp.replace("(", "");
                    temp = temp.replace(")", "");
                    for (int i = 0; i < temp.length(); i++) {
                        char t = temp.charAt(i);
                        if (Character.isUpperCase(t)) {
                            String x = String.valueOf(t);
                            String rep = " " + x.toLowerCase();
                            temp = temp.substring(0, i) + rep + temp.substring(i + 1, temp.length());
                        }
                    }
                    temp = temp.trim();
                } else {
                    for (int i = 0; i < temp.length() - 1; i++) {
                        char t = temp.charAt(i);
                        if (t == ' ') {
                            String next = String.valueOf(temp.charAt(i + 1));
                            String news = next.toUpperCase();
                            temp = temp.substring(0, i) + news + temp.substring(i + 2, temp.length());
                        }
                    }
                    temp.replace(" ", "");
                }
                if (s[1].equals("M") && s[0].equals("C"))
                    temp += "()";
                else if (s[1].equals("C") && s[0].equals("C")) {
                    int i = 0;
                    String next = String.valueOf(temp.charAt(0));
                    String news = next.toUpperCase();
                    temp = news + temp.substring(1, temp.length());
                }
                System.out.println(temp);
            }
        }
    }
