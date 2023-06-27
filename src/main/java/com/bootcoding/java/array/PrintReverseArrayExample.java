package com.bootcoding.java.array;

public class PrintReverseArrayExample {
    // Print all elements of array in a reverse order
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int n = nums.length;
        for(int i = 0 ;i < n; i++){
            System.out.println(nums[i]);
        }
        for(int i = n-1; i >= 0; i--){
            System.out.println(nums[i]);
        }
    }
}
