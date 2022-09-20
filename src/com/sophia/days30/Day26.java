package com.sophia.days30;

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int returnYear = scanner.nextInt();
        int returnMonth = scanner.nextInt();
        int returnDay = scanner.nextInt();

        int eYear =scanner.nextInt();
        int eMonth = scanner.nextInt();
        int eDay = scanner.nextInt();

        int totalFine = 0;
        if(returnYear > eYear){
            totalFine = 10000;

        }else if(returnYear == eYear){
            if(returnMonth > eMonth){
                totalFine = (returnMonth - eMonth)*500;

            }else if (returnMonth == eMonth){
                if(returnDay > eDay){
                    totalFine = (returnDay-eDay) * 15;


                }else{
                    totalFine =0;

                }

            }

        }
        System.out.println(totalFine);

    }
}


