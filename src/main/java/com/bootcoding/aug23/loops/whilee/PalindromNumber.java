package com.bootcoding.aug23.loops.whilee;

public class PalindromNumber {

    public static void main(String[] args) {

        int n = 1442;
        int r = 0;
        int org = n;
        while(n != 0){
            r = r * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Number: "+ org);
        System.out.println("Palindrome Number: " + r);
        if(org == r){
            System.out.println(org + " is PALINDROME number!");
        }else{
            System.out.println(org + " is NOT a palindrome number!");
        }

    }
}
