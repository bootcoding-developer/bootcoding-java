package com.bootcoding.abstraction.chocolate;

public abstract class Parent {
    abstract void purchase(double amount); // declare with no implementation
    public String message;

    public void print(){ // declare + implementation
        System.out.println("Parent Says: ");
        System.out.println(message);

    }
}
