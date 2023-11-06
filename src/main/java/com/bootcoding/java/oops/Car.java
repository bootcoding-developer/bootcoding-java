package com.bootcoding.java.oops;

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
        car1.color = "red";
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
