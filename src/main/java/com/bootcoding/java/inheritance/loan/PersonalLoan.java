package com.bootcoding.java.inheritance.loan;

public class PersonalLoan extends Loan{

    public void deposit(double amount){
        super.amount += amount;
    }
}
