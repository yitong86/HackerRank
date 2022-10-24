package com.sophia.java;
import java.util.Scanner;

public class ValidUsernameRegularEx {

   // class UsernameValidator {

        public static final String regularExpression= "^[a-zA-Z]\\w{7,29}";
    }

//    A valid username should start with an alphabet so, [A-Za-z].
//        All other characters can be alphabets, numbers or an underscore so, [A-Za-z0-9_].
//        Since length constraint was given as 8-30 and we had already fixed the first character, so we give {7,29}.
//        We use ^ and $ to specify the beginning and end of matching.