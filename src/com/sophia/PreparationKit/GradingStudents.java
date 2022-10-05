package com.sophia.PreparationKit;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        for(int i=0; i<grades.size(); i++){
            int grade = grades.get(i);
            int remainder = grade % 5;
            int least = grades.get(i) - remainder;
            int upper = least + 5;
            int difference = upper - grades.get(i);

            if(grade >= 38 && difference < 3){

                grades.set(i, grade+difference);//84 + 1
            }
        }

        return grades;
    }
}