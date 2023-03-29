package com.bootcoding.dsa.array;


// Q: Sum of all natural numbers from 1 to given number (n)
public class SumOfArray {

    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
