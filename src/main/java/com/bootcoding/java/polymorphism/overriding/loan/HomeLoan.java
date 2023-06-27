package com.bootcoding.java.polymorphism.overriding.loan;

public class HomeLoan extends BaseLoan{

    public double calculateROI(){
        System.out.println("Child method Invoked");
        return 9.5;
    }
}
