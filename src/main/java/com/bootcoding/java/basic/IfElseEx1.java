package com.bootcoding.java.basic;

public class IfElseEx1 {
    public static void main(String[] args) {
        // If Else
        // else without if is not possible
        // if without else is possible
        int n = 10;
        if(n % 2 == 0){
            System.out.println("Even Number is " + n + "!"); // Concatenation Operator
            System.out.println(n + " is Even Number"); // Concatenation Operator
        }else{
            System.out.println("ODD Number");
        }

    }
}
