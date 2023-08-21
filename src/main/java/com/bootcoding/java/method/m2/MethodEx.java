package com.bootcoding.java.method.m2;

public class MethodEx {

    // Method Calling
    public static void main(String[] args) {
        int sq = square(5); // Method Calling
        System.out.println("square of 5 " + sq);

        int sq2 = squareOfEven(6); // Method Calling
        System.out.println("square of 6 " + sq2);

        int sq3 = squareOfEven(7); // Method Calling
        System.out.println("square of 7 " + sq3);

        int res = add(10, 20); // Method Calling
        System.out.println(res);

        swap(10, 20);
        swapWithoutUsingThirdVariable(10, 20);
    }

    public static void swapWithoutUsingThirdVariable(int x , int y){
        System.out.println("BEFORE SWAP : x = " + x + " and y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("AFTER SWAP : x = " + x + " and y = " + y);
    }
    public static void swap(int x, int y){
        // using third variable
        // without third variable
        System.out.println("BEFORE SWAP : x = " + x + " and y = " + y);
        int temp  = x;
        x = y;
        y = temp;
        System.out.println("AFTER SWAP : x = " + x + " and y = " + y);
    }
    public static int add(int x, int y){
        return x + y;
    }
    // Method Definition
    public static int square(int n){
        return n * n;
    }

    public static int squareOfEven(int n){
        if(n % 2 == 0){
            return n * n;
        }
        return n;
    }

}
