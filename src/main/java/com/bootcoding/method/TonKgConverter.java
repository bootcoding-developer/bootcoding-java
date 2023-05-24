package com.bootcoding.method;

public class TonKgConverter {

    public static void main(String[] args) {
        int[] nums = {121, 23, 3456, 4};
        int countDigits = 0;
        int evenCount = 0;
        // for first element of an array
        int first = nums[0];
        while(first != 0){
            first = first / 10;
            countDigits++;
        }
        System.out.println(countDigits);
        if(countDigits % 2 == 0){
            evenCount++;
        }

    }


    // Method Definition - Method Parameters
    private static int convertToKg(int ton) {
        return ton * 1000;
    }
    private static int convertToQuintal(int ton) {
        return ton * 10;
    }
    private static double convertToTon(int kg) {
        return kg / 1000.00;
    }
}
