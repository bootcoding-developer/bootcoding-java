package com.bootcoding.java.method;

import java.util.Random;

public class MethodMultipleParameters {

    // palindrome of 3 numbers

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 100000; i++) {
            findPalindrome(random.nextInt(1000), random.nextInt(10000), random.nextInt(99));
        }
    }

    public static void findPalindrome(int n, int m, int o){
         findPalindrome(n);
         findPalindrome(m);
         findPalindrome(o);
    }

    public static void findPalindrome(int x){
        int org = x;
        int rem = 0;
        while(x != 0){
            rem = rem * 10 + x % 10;
            x = x / 10;
        }
        if(rem == org){
            System.out.println(org + " is palindrome!");
        }else{
            System.out.println(org + " is not a palindrome!");
        }

    }
}
