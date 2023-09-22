package com.bootcoding.aug23.array;

public class ArrayEx3 {
    // Sum of all elements of an array
    public static void main(String[] args) {
        int[] nums = {10, 33, 20, 5, 0};
        int sum = 0;
        for(int i = 0; i <= 4; i++){
            sum = sum + nums[i];
        }
        System.out.println("1 Baar: Sum of all elements : "+ sum);
    }
}

// Print the Count of odd elements