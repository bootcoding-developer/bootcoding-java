package com.bootcoding.java.loops;

import java.util.Random;

public class ForEx {
    public static void main(String[] args) {
        // Loops
        // for(initial value; condition; increment)
        // 1.Declare, 2.Condition, 3.Increment/Decrement
        for(int i = 1; i < 100; i++){
            int num = new Random().nextInt();
            if(num % 2 == 0){
                System.out.println(num + " is EVEN!");
            }else{
                System.out.println(num + " is ODD!");
            }
        }

        // Multiplication Table example
        int x = 15;
        for(int i = 1; i <= 10; i++){
            System.out.println(x + " * " + i + " = " + x * i);
        }
    }
}
