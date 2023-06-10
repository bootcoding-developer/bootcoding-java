package com.bootcoding.abstraction.interfaces.chocolate;

import com.bootcoding.abstraction.chocolate.Parent;

public class Child1 implements IParent {

    public void purchase(double amount) {
        // how to purchase // child 1
        System.out.println("I am child1: I bought KitKat!");
    }
}
