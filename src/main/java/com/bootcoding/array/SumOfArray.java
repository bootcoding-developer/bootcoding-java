package com.bootcoding.array;

public class SumOfArray {
    // Sum of all elements of an array
    // sum of even elements - print
    // sum of odd elements - print
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 7, 12};
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0) {
                evenSum = evenSum + nums[i];
            }else {
                oddSum = oddSum + nums[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
