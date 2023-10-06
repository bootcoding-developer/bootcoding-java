package com.bootcoding.aug23.oops.abstraction.bank;

public class BankApp {
    public static void main(String[] args) {
        IciciBank ib= new IciciBank();

        HdfcBank hb = new HdfcBank();

        hideComplexity(new IciciBank());

    }

    public static void hideComplexity(Bank b){
        System.out.println("Rate of Interest: " + b.rateOfInterest());
    }
}






