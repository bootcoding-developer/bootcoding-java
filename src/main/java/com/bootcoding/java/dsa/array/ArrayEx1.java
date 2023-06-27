package com.bootcoding.java.dsa.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 19, 31};
        // Traverse array
        int x = 10;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println(x + " is found!");
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}