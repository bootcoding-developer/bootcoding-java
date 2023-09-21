package com.bootcoding.aug23.method;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        boolean primeNumber = isPrimeNumber(num);
        if(primeNumber){
            System.out.println(num + " is a Prime Number!");
        }else {
            System.out.println(num + " is not a Prime Number!");
        }
    }
    // Calculate PrimeNumber
    public static boolean isPrimeNumber(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
