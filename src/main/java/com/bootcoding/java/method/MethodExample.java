package com.bootcoding.java.method;

public class MethodExample {

    // Method Definition
    public static void printHello(){
        System.out.println("Hello Java, using printHello() method");
    }

    public static void main(String[] var) {

        printHello(); // method ko call
        print("Ramesh: Hello Ganesh");
        print("Ganesh: Hello Ramesh");
        print("Ramesh: I am learning Java from Bootcoding!");
        print("Ganesh: Wow! Great I heard they provide practicals on Java");


    }

    // Types of Method
    // 1) No Parameter Method or Zero Argument Method
    // 2) Parameter Methods (1 or more arguments)

    String message = "Ramesh: Hello Ganesh";
    public static void print(String message){
        System.out.println(message);

    }

}
