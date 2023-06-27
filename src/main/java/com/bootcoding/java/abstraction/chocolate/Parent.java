package com.bootcoding.java.abstraction.chocolate;

public abstract class Parent {
    abstract void purchase(double amount); // declare with no implementation
    public String message;

    public void print(){ // declare + implementation
        System.out.println("Parent Says: ");
        System.out.println(message);

    }
}


//1. Demonstrate Abstraction on Book as parent with TextBook, AudioBook and EBook as childs
//2. Demonstrate Abstraction on Loan as parent with HomeLoan, CarLoan, EducationLoan


//1. Using Interface on Book as parent with TextBook, AudioBook and EBook as childs
//2. Using Interface on Loan as parent with HomeLoan, CarLoan, EducationLoan
