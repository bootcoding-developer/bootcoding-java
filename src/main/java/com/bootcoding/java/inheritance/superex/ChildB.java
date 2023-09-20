package com.bootcoding.java.inheritance.superex;

public class ChildB extends ParentA{
    int age;
    public ChildB(){
        super(10);
        System.out.println("I am ChildB - default constructor");
    }
    public ChildB(int age){
        super(age);
        this.age = age;
        System.out.println("I am ChildB - parametrized constructor");
    }
    public void display(){
        System.out.println("I am ChildB - display()");
        super.display();
        int a = super.age;
    }
}
