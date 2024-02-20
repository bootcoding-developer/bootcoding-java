package com.bootcoding.assignment;

public class ScannerEx1 {

    public static void main(String[] args) {
        int a = 2;
        int power = 1;

        System.out.println("The 2 raised to the power of number  = " + (0) + "=" + (power)  );
        for( int i = 1; i<=5; i++)
        {
            power = power * a;
            System.out.println("The 2 raised to the power of number " + (i) + " is " + (power)  );
        }
    }
}

// First Iteration : i = 0, print 1, power = 1, Print 2 raise.... 1

// Second Iteration: i = 1, Power = 2, Print 2

// 3rd Iteration: i = 2, Power = 4, Print 4

// 4rd Iteration: i = 3, Power = 8, Print 8

// 5rd Iteration: i = 4, Power = 16, Print 16

// 3rd Iteration: i = 5, Power = 32, Print 32
