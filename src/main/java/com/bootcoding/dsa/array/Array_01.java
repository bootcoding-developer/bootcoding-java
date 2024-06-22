package com.bootcoding.dsa.array;

public class Array_01 {

    public static void main(String[] args) {

        //1. Declare Array
        double prices [] = {95, 85, 88, 80, 75, 59};
        int index = 0;
        for(index = prices.length/2; index < prices.length; index++){
            System.out.println(prices[index]);
        }



    }
}
