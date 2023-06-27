package com.bootcoding.java.loops;

public class WhileEx {
    public static void main(String[] args) {

        // WAP to check whether a given number is palindrom or not
        // 123 == 321 - Not a Palindrom
        // 121 == 121 - Palindrom

        int num = 12221;
        int org = num;
        int r = 0;
        while(num != 0){
            int d = num / 10; // quotient
            r = r * 10 + num % 10; // remainder
            num = d; // 1234 -> 123
        }
        System.out.println(org);
        System.out.println(r);
        if(r == org){
            System.out.println(org + " is a palindrome!");
        }else{
            System.out.println(org + " is not a palindrome");
        }
        // Iteration

    }
}
