package com.bootcoding.java.search;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        int x = 2;
//        int index = binarySearch(a, x, 0, a.length-1);
//        System.out.println(x + " is found at " + index);

//        int[] b = {-4,-2,1,4,8};
        int[] b = {61488, 18221, -1321, 90249, -62158, 55128, -93476, 53905, 57644, 24630, 89599, -95795, -14891, -60298, 17690, 99022, -24006, -89156, 80135, -46303, 18812, 59924, 32024, 82924, -47519, -77086, 1763, 68618, 53629, -56957, 95485, 99630, -7977, 31164, 94481, -80239, -57749, -3319, -58231, -94841, -19292, 33200, -31446, -3528, 2229, 74241, -19992, -91852, -28073, 31453, -74484, 35491, 38870, -9499, 39838, 87369, 21123, -38616, -89277, -14541, -81586, -18569, -58242, -71216, 10816, 15086, -10519, 51080, 53257, -4912, -37142, -16723, -69795, 54937, -24920, 68970, -10010, -81717, 36203, -67939, 73877, -58258, -57183, 36637, 91518, -8492, -57476, 50523, 62462, 73152, -9511, -66761, 28333, -87163, 5187};
        System.out.println(findClosestNumber(b));
    }


    public static int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int positive = 0;
        int negative = nums[0];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) {
                return 0;
            }
            if(nums[i] > 0){
                positive = nums[i];
                break;
            }
            negative = nums[i];
        }
        if(positive == 0){
            return nums[n - 1];
        }
        if(Math.abs(negative) < positive){
            return negative;
        }
        return positive;
    }

    private static int binarySearch(int[] a, int x, int left, int right) {
        int mid = (left + right) / 2;
        if (x == a[mid]) {
            return mid;
        }
        if (left >= right) {
            return -1;
        }
        if (x > a[mid]) {
            return binarySearch(a, x, mid + 1, right);
        } else {
            return binarySearch(a, x, left, mid - 1);
        }
    }
}
