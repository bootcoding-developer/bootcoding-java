package com.bootcoding.java.exception;

import java.util.Scanner;

public class DivideByZeroException {

    public static void main(String[] args) {

        int a = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer:");

        try {
            int x = scanner.nextInt();
            double d = a / x; // exception // terminate
            System.out.println("d = " + d);
        } catch (ArithmeticException ex){
            System.out.println("0 is not allowed!");
        }
    }
}
