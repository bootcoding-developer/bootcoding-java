package com.bootcoding.array;

public class EvenArrayExample {
    // Print only even number of an array
    public static void main(String[] args) {

        int[] nums = {11, 26, 39, 40, 54};



        // traverse array
        // find even number
        // print only even number

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }

        System.out.println("*******************");
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                System.out.println(nums[i]);
            }
        }
    }

    // Print element of an array at even index
}
