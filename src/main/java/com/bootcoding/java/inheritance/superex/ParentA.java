package com.bootcoding.java.inheritance.superex;

public class ParentA {
    int age;
    public ParentA(){
        System.out.println("I am ParentA - default constructor");
    }
    public ParentA(int age){
        this.age = age;
        System.out.println("I am ParentA - parametrized constructor");
    }
    public void display(){
        System.out.println("I am ParentA - display()");
    }
}
