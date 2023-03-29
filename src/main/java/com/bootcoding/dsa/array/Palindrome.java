package com.bootcoding.dsa.array;

public class Palindrome {

    public static void main(String[] args) {

        int n = 1234;
        int r = 0;
        int temp = n;
        while(n != 0){
            r = r * 10 + n % 10;
            n = n / 10;
        }
        if(r == temp){
            System.out.println(temp + " is Palindrome!");
        }else{
            System.out.println(temp + " is not Palindrome!");
        }
    }
}


















