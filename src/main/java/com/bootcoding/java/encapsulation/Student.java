package com.bootcoding.java.encapsulation;

public class Student {
    String name;
    int rollNo;
    String department;
    boolean isPass;
    double percentage;

    // Access Specifiers
    void test(){
        Department csDept = new Department();
        //csDept.totalExpenditure = 10000.00;
        csDept.totalTeachers = 10;
        csDept.totalStudents = 100;

    }
}
