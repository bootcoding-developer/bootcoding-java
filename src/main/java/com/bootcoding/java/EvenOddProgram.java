package com.bootcoding.java;

public class EvenOddProgram extends Object{
    int age;
    public static void main(String[] args) {
        int a = 10; // start
        int n = 10;
        System.out.println(n);
        // block
        {
            int quantity = 10; // start life
            System.out.println(quantity);
            {

                double score = 1.0 + 2.0 * 3.0;

                String name = "\nRamesh";
                System.out.println(name);
                String nam2e = "\tRamesh";
                System.out.println(nam2e);
            }
        }
        // scope - life
    } // end life
}

