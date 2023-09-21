package com.bootcoding.aug23.method;

import java.util.Scanner;

public class MaxNumberMethod {


    // Find max number among given 3 numbers
    public static int findMax(int n1, int n2, int n3){
        if(n1 > n2 && n1 > n3){
            return n1;
        }else if(n2 > n1 && n2 > n3){
            return n2;
        }
        return n3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        System.out.println("Enter third number");
        int z = sc.nextInt();
        int max = findMax(x, y, z);
        System.out.println("Maximum number is " + max);
    }
}
