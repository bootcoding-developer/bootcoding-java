package com.bootcoding.java.switchcase;

public class SwitchCaseEx1 {
    public static void main(String[] args) {

        String month = "JAN";

        switch (month){
            case "JAN":
                System.out.println(" I am january");
                break;
            case "FEB":
                System.out.println(" I am feb");
                break;
            case "MARCH":
                print("MARCH Month");
                break;
            case "APRIL":
                System.out.println();
                print("April Month");
                break;
            default:
                System.out.println("Please provide valid month!");
        }
    }

    public static void print(String m){
        System.out.println(m);
    }
}
