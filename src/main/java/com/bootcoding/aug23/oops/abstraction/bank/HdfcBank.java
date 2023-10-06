package com.bootcoding.aug23.oops.abstraction.bank;

public class HdfcBank extends Bank {

    public void show(){
        // This is my implementation
        System.out.println("Hey, I am a HDFC Bank");
    }

    public double rateOfInterest(){
        return 9.5;
    }
}
