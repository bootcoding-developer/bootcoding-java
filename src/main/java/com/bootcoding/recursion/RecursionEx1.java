package com.bootcoding.recursion;

public class RecursionEx1 {
    public static void main(String[] args) {
        System.out.println("using recursion (descending)");
        printDescending(5);
        System.out.println("using recursion (ascending)");
        printAscending(5);
        //  5 to 1

        System.out.println("Using for loop");
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
    }

    public static void printDescending(int n){
        // Must have Base Condition or Termination Condition
        if(n == 0){
            return ; // exit
        }
        // print message
        System.out.println(n);
        // calling itself (recursion call)
        printDescending(n-1);
    }


    public static void printAscending(int n){
        // Must have Base Condition or Termination Condition
        if(n == 0){
            return ; // exit
        }
        // calling itself (recursion call)
        printAscending(n-1);
        // print message
        System.out.println(n);
    }
}
