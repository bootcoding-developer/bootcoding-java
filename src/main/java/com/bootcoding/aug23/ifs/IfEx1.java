package com.bootcoding.aug23.ifs;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        double n = sc.nextDouble();
        System.out.println("Enter Second Number");
        double m = sc.nextDouble();

        if(n > m){
            System.out.println(n + " > " + m);
        }
        if(n < m){
            System.out.println(n + " < " + m);
        }
        if( n == m){
            System.out.println(n + " == " + m);
        }
    }
}
