package com.bootcoding.inheritance.furniture;

public class TableApp {
    public static void main(String[] args) {

        DiningTable dt = new DiningTable();
        ComputerTable ct = new ComputerTable();
        ct.setLegs(3);
        ct.setColor("Golden");
        dt.setColor("Brown");
        dt.setLegs(6);

        System.out.println(dt.getLegs());
    }
}
