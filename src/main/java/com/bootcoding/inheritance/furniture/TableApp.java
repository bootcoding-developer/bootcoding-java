package com.bootcoding.inheritance.furniture;

import com.bootcoding.inheritance.furniture.test.Table;

public class TableApp {
    public static void main(String[] args) {

        DiningTable dt = new DiningTable();
        ComputerTable ct = new ComputerTable();
        ct.setDimensions("3 by 3");
        System.out.println(ct.getDimensions());
        ct.print();



//        System.out.println("Table legs: " + t.legs);
    }
}



// Book - title, price, pages, publicationDate, type
// TextBook, EBook, AudioBook
// keep public all fields**
// Create object of child classes in main method (separate class)
// create object of parent class in main method and print all properties
// keep 2 properties private
// then create child objects and try to access private fields
// create 2 methods in Book class (buy and sale)
// make 1 method as private and protected

// getter and setters
