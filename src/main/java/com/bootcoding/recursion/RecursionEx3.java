package com.bootcoding.recursion;

public class RecursionEx3 {
    public static void main(String[] args) {

        // WAP to count digits using recursion
        // n = 999
        // n % 10 = remainder (last digit) = 9
        // n / 10 = quotient = 99

        // using loop
        // ? count, n
        int count = 0;
        int n = 999;
        while(n != 0){
            count++;
            n = n / 10;
        }
        System.out.println("Number of digits in 999 is " + count);

        count = countDigits(999);
        System.out.println("(using recursion) Number of digits in 999 is " + count);
    }
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}
