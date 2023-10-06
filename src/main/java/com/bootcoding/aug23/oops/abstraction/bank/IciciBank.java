package com.bootcoding.aug23.oops.abstraction.bank;

public class IciciBank extends Bank{

    public void show(){
        // This is my implementation
        System.out.println("Hey, I am an Icici Bank");
    }

    public double rateOfInterest(){
        return 10.5;
    }


}
