package com.bootcoding.java.inheritance.loan;

public class LoanApp {
    public static void main(String[] args) {

        PersonalLoan pl = new PersonalLoan();
        pl.amount = 25000;
        pl.withdraw(500);
        pl.deposit(5000);

        HomeLoan hl = new HomeLoan();
        hl.amount = 250000;
        hl.withdraw(50000);

        CarLoan cl = new CarLoan();
        cl.deposit(500);
    }
}
