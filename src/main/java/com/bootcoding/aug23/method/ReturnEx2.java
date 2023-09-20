package com.bootcoding.aug23.method;

import java.util.Scanner;

public class ReturnEx2 {
    public static void main(String[] args) {
        // 3! = 1 * 2 * 3; = 6
        // 5! = 1 * 2 * 3 * 4 * 5; = 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        int f = getFactorial(num);
        System.out.println("Factorial of "+ num +" is "+ f);
    }

    public static int getFactorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }



    // WAM to get sum of 1 to given number N using Method
    // WAM to get sum of cube of even number from 2 to N (given number) using method
    // WAM to get maximum number among 3 given numbers using method
}
