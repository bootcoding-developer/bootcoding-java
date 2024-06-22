package com.bootcoding.java.composition.student;

public class Mobile {
    String company;
    double price;
    int camera;
    int ram;

    public void start(){
        System.out.println("Mobile has been started!!!");
    }

    public void restart(){
        System.out.println("Mobile has been restarted!!!");
    }

    public static void main(String[] args) {
        // Create Object
        Mobile realme = new Mobile();
        realme.company = "Realme";
        realme.price = 12000.00;
        realme.camera = 12;
        realme.ram = 4;
        realme.start();
        System.out.println("Company = " + realme.company);
        System.out.println("Price = " + realme.price);
        System.out.println("Camera = " + realme.camera + " MB");
        System.out.println("Ram = " + realme.ram + " GB");
    }
}
