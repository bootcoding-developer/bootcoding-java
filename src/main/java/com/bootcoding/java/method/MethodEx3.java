package com.bootcoding.java.method;

public class MethodEx3 {
    public static void main(String[] args) {
        calcAvgAndPercentage();
        add(10, 20); // calling 2 arguments - value
        add(100, -20); // calling 2 arguments - value
        add(17, 23); // calling 2 arguments - value
        add(-10, -20); // calling 2 arguments - value
        add(-10, 0); // calling 2 arguments - value
        add(12, -13); // calling 2 arguments - value
    }
    // Method with 2 Parameters
    public static void add(int a, int b){
        System.out.println(a + b);
    }

//
//    public static void add(){
//
//    }
    // Method with 0 parameters

    // Method Calling
    // name of Method with ()

    // Method definition
    // Method signature - public  void  add()
    // Method Body - {
    //        int a = 10;
    //        int b = 20;
    //        System.out.println(a + b);
    //    }
    private static void calcAvgAndPercentage() {
        int m1 = 75;
        int m2 = 67;
        int m3 = 57;
        double percentage = 0.0;
        double average = 0.0;
        int sum = m1 + m2 + m3;
        average = sum / 3.0;
        percentage = sum/300.00 * 100.00;
        System.out.println("AVG Marks : " + average);
        System.out.println("Percentage Marks: " + percentage);
    }
}
