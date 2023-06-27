package com.bootcoding.java.recursion;

public class RecursionEx2 {
    public static void main(String[] args) {
        // factorial
        // n! = n * n-1 * n-2 * n-3 * 1;
        // n! = 1 * 2 * 3 * ... n
        // using for loop
        long fact = 1;
        for(int i = 1; i <=5 ;i ++){
            fact = fact * i;
        }
        System.out.println("(Using Loop) Factorial of 5 is " + fact);
        // using recursion
        int res = getFact(5);
        System.out.println("(Using recursion) Factorial of 5 is " + res);
    }

    public static int getFact(int n){
        if(n == 1){
            return 1;
        }
        return n * getFact(n-1);
    }


}
