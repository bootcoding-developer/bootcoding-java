package com.bootcoding.java.polymorphism.overriding.loan;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan();
        double hlROI = hl.calculateROI();
        System.out.println("HOME Loan ROI: " + hlROI);
    }
}
