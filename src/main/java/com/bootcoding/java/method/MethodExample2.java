package com.bootcoding.java.method;

public class MethodExample2 {

    public static void main(String[] args) {
        int n = 10;
        printEvenNumber(n);

    }

    // WAM to print even number from 2 to given number

    // TODO - WAM to print number which is divisible by 5 from 5 to given number
    public static void printEvenNumber(int num){

        // logic for even - if condition
        // logic for print multiple times - for loop
        for(int i = 2; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even number");
            }
        }
    }
}
