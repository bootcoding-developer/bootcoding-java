package com.bootcoding.aug23.loops;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int x = 1; x <= n; x++){
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
// WAP to print sum of only even number from 2 to given number
// WAP to print multiplication table of a given number
// WAP to print Factorial of a given number
// WAP to print square of odd number from 1 to given number
