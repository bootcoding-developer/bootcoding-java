package com.bootcoding.abstraction.chocolate;

public class ParentApp {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        Child3 ch3 = new Child3();

        ch1.purchase(10);
        ch2.purchase(10);
        ch3.purchase(10);

        print(ch1);
        print(ch2);
        print(ch3);
    }






    public static void print(Parent object){
        object.print();
    }
}
