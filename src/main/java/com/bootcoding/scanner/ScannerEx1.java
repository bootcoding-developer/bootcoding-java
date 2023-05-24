package com.bootcoding.scanner;

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {

        // How to create an instance / object of a Scanner
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter any number  (To exit, enter -1)");
            int x = sc.nextInt(); // to take input from user
            if(x < 0){
                break;
            }
            boolean res = isPrime(x); // passing value of a variable
//        System.out.println(x);
            if (res) {
                System.out.println(x + " is a prime number!");
            } else {
                System.out.println(x + " is not a prime number!");
            }

        }
    }

    public static boolean isPrime(int val){ // method parameter
        // Logic
        // Find a number is divisible by itself or 1

        // what is divisible
        // 12 - 1, 2, 4, 6, 12
        // 11 - 1, 11

        // find a number which is divisible by 2 to 10

        for( int i = 2; i < val; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }




}
