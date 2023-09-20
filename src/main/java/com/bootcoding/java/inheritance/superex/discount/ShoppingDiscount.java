package com.bootcoding.java.inheritance.superex.discount;

public class ShoppingDiscount extends Discount{
    double amount;
    int discount;

    public ShoppingDiscount(){
        System.out.println("I am ShoppingDiscount - default constructor");
        super.amount = this.amount;
    }

    public ShoppingDiscount(int discount){
        System.out.println("I am ShoppingDiscount - parameterized constructor");
        this.discount = discount;
        super.discount = discount;
    }

    public double getDiscountPrice(){
        return super.getDiscountPrice();
    }
 
}
