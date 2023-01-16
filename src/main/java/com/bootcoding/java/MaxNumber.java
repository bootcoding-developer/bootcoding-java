package com.bootcoding.java;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number:");
        int first = sc.nextInt();
        System.out.println("Second Number:");
        int second = sc.nextInt();
        System.out.println("Third Number:");
        int third = sc.nextInt();

        // logic to find max number
        if(first >= second && first >= third){
            System.out.println(first + " is max number");
        }else if(second >= first && second >= third){
            System.out.println(second + " is max number");
        }else {
            System.out.println(third + " is max number");
        }

    }
}
