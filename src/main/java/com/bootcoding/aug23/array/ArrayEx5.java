package com.bootcoding.aug23.array;

public class ArrayEx5 {
    public static void main(String[] args) {

        double[] prices = {25.00, 35.50, 40.00, 50.00};

        // to get size of array
        int size = prices.length;

        // Traverse -
        for(int k = 0; k < size; k++){
            System.out.println(prices[k]);
        }
        // Task - sum of cube of each element
        double sum = 0.0;
        for(int count = 0; count < size; count++){
            double cube = prices[count] * prices[count] * prices[count];
            sum = sum + cube;
        }
        System.out.println("Sum of cube of array: " + sum);
    }
}
