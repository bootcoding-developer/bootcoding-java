package com.bootcoding.java;
import java.util.Scanner;
public class EvenOddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt(); // 10
        int a = 10;
        n = a + 2 + ++a; // 23
//        n = a + 2 + a++; // 22

        if(n % 2 == 0){
            System.out.println(n + " is Even number");
        }else{
            System.out.println(n + " is Odd number");
        }
    }
}
