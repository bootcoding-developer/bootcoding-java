package com.bootcoding.aug23.method;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int x = sc.nextInt();
        System.out.println("Enter any another Number:");
        int y = sc.nextInt();
        add(x, y);
        sub(x, y);

        addReturn(10, 20);
        int res = addReturn(10, 20);
        System.out.println(res);
    }

    public static int addReturn(int a, int b){
        int c = a + b;
        System.out.println("Addition is " + c);
        return c;
    }

    public static void add(int a, int b){
        int c = a + b;
        System.out.println("Addition is " + c);
    }

    public static void sub(int a, int b){
        int c = a - b;
        System.out.println("Subtraction is " + c);
    }


    // Method - Method Difinition
    // Method - Method Calling
    // Method - No Parameter Method (no arguments)
    // Method - Parmeterized Method (single or multiple parameters)


    // Method Return Type








}
