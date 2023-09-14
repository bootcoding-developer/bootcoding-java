package com.bootcoding.aug23.ifs;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        evenOdd(); // method calling
    }
    // Method Definition
    public static void evenOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println(n + " is even Number ");
        }else {
            System.out.println(n + " is ODD Number ");
        }
    }
}