package com.bootcoding.aug23.oops.interfaces;

public class CarApp {
    public static void main(String[] args) {
        BmwCar bmw = new BmwCar();
        bmw.start();

        MGHectorCar mg = new MGHectorCar();
        mg.start();

        Car bmw2 = new BmwCar();
        Car mg2 = new MGHectorCar();

        bmw2.start();
        mg2.start();
    }
}
