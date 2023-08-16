package com.bootcoding.java.basic;

import java.util.Scanner;

public class IfElseEx12 {
    public static void main(String[] args) {
        // If Else
        // else without if is not possible
        // if without else is possible
        Scanner scanner = new Scanner(System.in);
        // Enter Any Number
        System.out.println("Enter Any Positive Number!");
        int n = scanner.nextInt(); // stop / wait for user input
        if(n % 2 == 0){
            System.out.println("Even Number is " + n + "!"); // Concatenation Operator
            System.out.println(n + " is Even Number"); // Concatenation Operator
        }else{
            System.out.println("ODD Number");
        }

    }
}
