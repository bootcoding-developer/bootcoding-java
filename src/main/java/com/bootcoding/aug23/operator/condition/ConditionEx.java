package com.bootcoding.aug23.operator.condition;

import java.util.Scanner;

public class ConditionEx {
    public static void main(String[] args) {

        // Scanner - to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter another number:");
        int b = sc.nextInt();

        boolean c = a > b;
        System.out.println(a + " is greater than " + b + " = " + c);
    }
}
