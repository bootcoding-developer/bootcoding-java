package com.bootcoding.java.exception;

public class ThrowExample {

    public static void main(String[] args) {
        try{
            test();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void test() throws ArithmeticException{
        int d = 10 / 0;
    }
}
