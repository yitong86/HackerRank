package com.sophia.days30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Day28 {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bufferedReader.readLine().trim());
            ArrayList<String> array = new ArrayList<>();

            for (int NItr = 0; NItr < N; NItr++) {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];
                //System.out.println(firstName);

                String emailID = firstMultipleInput[1];
                // System.out.println(emailID);


                if(emailID.matches("(.*)@gmail.com")){
                    array.add(firstName);
                }

            }
            Collections.sort(array);
            for(int i = 0;i<array.size();i++){
                System.out.println(array.get(i));

            }

            bufferedReader.close();
        }
    }


