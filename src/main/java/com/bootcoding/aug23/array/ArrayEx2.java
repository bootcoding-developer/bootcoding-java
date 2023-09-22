package com.bootcoding.aug23.array;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,14};
        int count = 0;

        for (int i = 0; i <=4; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("The number of odd numbers  " + count);
    }
}

// Print the Count of odd elements