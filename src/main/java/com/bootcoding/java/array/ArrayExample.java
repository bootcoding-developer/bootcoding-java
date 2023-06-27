package com.bootcoding.java.array;

public class ArrayExample {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        // array.length
        int n = nums.length;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        for(int i = 0; i < n; i++){
            System.out.println(nums[i]);
        }



    }
}
