package com.bootcoding.java.inheritance.superex.discount;

public class Discount {
    double amount;
    int discount;

    public Discount(){
        System.out.println("I am Discount - default constructor");
    }

    public Discount(int discount){
        System.out.println("I am Discount - paramterized constructor");
        this.discount = discount;
    }

    public double getDiscountPrice(){
        return amount - (amount * (discount / 100.00));
    }

}
