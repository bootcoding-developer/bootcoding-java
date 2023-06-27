package com.bootcoding.java.service.factorial;

import com.bootcoding.java.service.multi.MultiplicationTableService;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialService fs = new FactorialService();
        long[] nums = {2,5,6,9};
        long[] results = fs.getFacts(nums);
        PrintService ps = new PrintService();
        System.out.println("Input Array: ");
//        fs.printFact(nums);
        ps.printArray(nums);
        System.out.println("\n Output array: ");
//        fs.printFact(results);
        ps.printArray(results);

        MultiplicationTableService mpts = new MultiplicationTableService();
        long[] multiplicationTable = mpts.getMultiplicationTable(10);

        System.out.println("\n Multiplication Table ");
        ps.printArray(multiplicationTable);
    }
}


// bootcoding.dev@gmail.com