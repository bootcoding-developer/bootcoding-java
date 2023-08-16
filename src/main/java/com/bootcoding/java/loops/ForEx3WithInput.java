package com.bootcoding.java.loops;

import java.util.Scanner;

// Task: Print sum of all numbers from 1 to given number (n)

public class ForEx3WithInput {
    public static void main(String[] args) {
        // Scanner is used to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Positive Number!");
        int n = scanner.nextInt(); // waiting for user input
        // n times loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
