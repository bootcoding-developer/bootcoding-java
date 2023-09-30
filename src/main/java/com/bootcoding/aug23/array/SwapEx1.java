package com.bootcoding.aug23.array;

public class SwapEx1 {
    //WAP to swap values of x and y
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        // with using third variable
        int temp = x;
        x = y;
        y = temp;

        // without using third variable
        x = x + y; // x = 10 + 20 = 30
        y = x - y; // y = 30 - 20 = 10
        x = x - y; // x = 30 - 10 = 20

        int ab[] = {10, 20};
        // using third variable
        int k = ab[0];
        ab[0] = ab[1];
        ab[1] = k;

        int abc[] = {10, 20, 30};
        int d = abc[0];
        abc[0] = abc[2];
        abc[2] = d;


    }
}
