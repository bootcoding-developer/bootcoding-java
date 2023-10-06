package com.bootcoding.aug23.oops.abstraction.bank;

public abstract class Bank {


    // method - concrete methods
    // abstract methods - NO Body or NO IMplementation

    public void print(){
        System.out.println("I am non abstract method or Concrete Method!");
    }

    // child classes to implement this abstract method to
    // achieve different behaviour of each child class

    public abstract double rateOfInterest();
}
