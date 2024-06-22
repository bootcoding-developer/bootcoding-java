package com.bootcoding.oops.constructor;

public class Student {
    String name;
    double percentage;
    int rollNumber;

    public Student(){
        System.out.println("Default Constructor!!!");
    }

    public Student(String n, double p, int r){
        name = n;
        percentage = p;
        rollNumber = r;
        System.out.println("Parametrized Constructor!!!");
    }

    public static void main(String[] args) {
        Student ramesh = new Student();
        Student suresh = new Student();
        Student ganesh = new Student("Ganesh", 77.50, 109);
    }
}

