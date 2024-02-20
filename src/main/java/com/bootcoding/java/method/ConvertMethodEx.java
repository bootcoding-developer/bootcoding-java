package com.bootcoding.java.method;

import java.util.Scanner;

public class ConvertMethodEx {


    // Method Definition - Method Parameters
    private static int convertToKg(int ton) {
        return ton * 1000;
    }

    private static int convertToQuintal(int ton) {
        return ton * 10;
    }

    private static double convertToTon(double kg) {
        return kg / 1000.00;
    }

    private void add(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        //ConvertMethodEx c = new ConvertMethodEx();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = ConvertMethodEx.convertToKg(n);
        System.out.println(sum);

        System.out.println("enter your % : ");
        double d = sc.nextDouble();
        double v = convertToTon(d);
        System.out.println(v);

        ConvertMethodEx convertMethodEx = new ConvertMethodEx();
        convertMethodEx.add(10, 20);
    }

}
