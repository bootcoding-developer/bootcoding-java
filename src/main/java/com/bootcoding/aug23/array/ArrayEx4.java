package com.bootcoding.aug23.array;

import java.util.Scanner;

public class ArrayEx4 {
    // Sum of all elements of an array
    public static void main(String[] args) {

        // Take Array from user
        // 1) User input - array size or array length
        // 2) Loop main scanner.nextInt()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size/Length:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.println("Enter next Array Element:");
            int element = scanner.nextInt();
            nums[i] = element;
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("Sum of all elements : "+ sum);
    }
}

// Print maximum number of given array
// print cube of each element of an array