package com.bootcoding.java.oops;

import java.util.Scanner;

public class Car {
    int wheels;
    String color;
    double price;
    boolean isAutomatic;
    String companyName;

    public void start(){
        System.out.println("Car has been started");
    }
    public void stop(){
        System.out.println("Car has been stopped");
    }

    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.color = "Black";
        mercedes.isAutomatic = true;
        mercedes.companyName = "Mercedes";
        Car bmw = new Car();
        Car car2 = new Car();
        Car car1 = new Car();
        car1.start();
        car1.stop();
        String color = "Red";


        // 1. Bike
        // 2. Building

        // 1. Tell the Definition of Real World Object to Computer
        // Class - Blueprint of Object
        // Class - is way to define real world object properties/attributes and behaviour
        // CLass is consists of Data Members and Member Methods

        // Object is an instance of a Class
        // Object is a runtime entity of a Class

        // CLass doesn't get any memory - can't initialize data members
        // Object get memory - it initialize data members

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Color:");
        String carColor = sc.next();
        car1.color = carColor;
        car1.isAutomatic = true;
        car1.companyName = "Mercedes";
        car1.wheels = 4;
        System.out.println("Color :" + car1.color);
        System.out.println("CompanyName : " + car1.companyName);
        System.out.println("isAutomatic : " + car1.isAutomatic);
        System.out.println("Wheels : " + car1.wheels);

        System.out.println(" ====== My Mercedes Car === Kal hi kharidi ==== ");
        System.out.println("Color :" + mercedes.color);
        System.out.println("CompanyName : " + mercedes.companyName);
        System.out.println("isAutomatic : " + mercedes.isAutomatic);

    }
}
