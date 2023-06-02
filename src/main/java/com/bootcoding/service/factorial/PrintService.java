package com.bootcoding.service.factorial;

public class PrintService {

    public void printArray(long[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
    }
}
