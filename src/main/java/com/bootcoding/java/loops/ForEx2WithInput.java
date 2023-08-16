package com.bootcoding.java.loops;

import java.util.Scanner;

// Task: Print Even Odd Number from 1 to User Input Number (n)

public class ForEx2WithInput {
    public static void main(String[] args) {
        // Loops
        // for(initial value; condition; increment)
        // 1.Declare, 2.Condition, 3.Increment/Decrement

        // Scanner is used to take user input
        Scanner scanner = new Scanner(System.in);
        // Enter Any Number
        System.out.println("Enter Any Positive Number!");
        int n = scanner.nextInt(); // stop / wait for user input

       for(int i = 1; i <= n; i++){
           if(i % 2 == 0){
               System.out.println(i + " is Even Number!");
           }else{
               System.out.println(i + " is Odd Number!");
           }
       }
    }
}
