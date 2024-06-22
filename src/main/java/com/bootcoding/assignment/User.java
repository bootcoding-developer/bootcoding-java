package com.bootcoding.assignment;

public class User {

    public void method1(){
        System.out.println("In method 1");
    }

    public static void method2(){
        System.out.println("In method 2");
    }

    public static void main(String[] args) {

        final int a = 20 ;



        User.method2();
    }
}
