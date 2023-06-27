package com.bootcoding.java.dsa.array;

public class MoveZeros {

    public static void main(String[] args) {

        int nums[] = {0 , 1, 0, 3, 12};
        int current = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[current++] = nums[i];
            }
        }
        // bootcoding.dev@gmail.com
        // Subject -> KDK-CSE-2025

        while(current < nums.length){
            nums[current++] = 0;
        }
        System.out.println(nums);
    }
}
