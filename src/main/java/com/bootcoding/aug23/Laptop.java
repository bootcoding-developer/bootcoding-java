package com.bootcoding.aug23;

public class Laptop{
    // Data Member
    String model;
    double price;
    String company;

    public static void print(Laptop laptop){
        laptop.model = "100";
        int a = 10 + 20;
        System.out.println("Model = " + laptop.model);
        System.out.println("M = " + (10 + 20));
        System.out.println("Price = " + laptop.price);
        System.out.println("Company = " + laptop.company);
    }

    public void setModel(String value){
            model = value;
    }

    // Hello I am sjlkajgslad


    /// asjgsjdlg euyoiweury
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        // 1.
//        hp.model = "HP Paivilion";
        hp.print(hp);


        // Getter and Setter
        // 2.
        hp.setModel("HP Paivilion");
    }
}