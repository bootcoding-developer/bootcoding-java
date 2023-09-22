package com.bootcoding.aug23.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] nums = {10, 33, 20, 5, 0};

        for(int i = 0; i <= 4; i++){
            if(nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}

// Print the Count of odd elements