package com.bootcoding.java.method;

import java.util.Scanner;

public class KiloMeterUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        convertToMeter(km);
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter distance in KM:");
            int km = sc.nextInt();
            System.out.println(km + " KM = " + km * 1000 + " meters");
        }
    }

    public static void convertToMeter(int kilometer){
        // Logic to convert KM to Meter
        System.out.println(kilometer + " KM = " + kilometer * 1000 + " meters");

        // 2 KM = 2000 meters
    }
}
