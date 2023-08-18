package com.bootcoding.java.method;

import java.util.Random;

public class PrimeNumberUsingMethod {

    public static void main(String[] args) {
        // Prime Number
        // Number - which is divisible by 1 and itself.


        Random r = new Random();
        for(int k = 0; k < 50; k++) {
            int num = 67 + r.nextInt(100);
            System.out.println("Random Number: " + num);
            prime(num);
        }
    }

    public static boolean prime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

























    boolean isTwentyPrime = isPrime(20);
    boolean isSeventeenPrime = isPrime(17);
    public static boolean isPrime(int num){

        for( int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
