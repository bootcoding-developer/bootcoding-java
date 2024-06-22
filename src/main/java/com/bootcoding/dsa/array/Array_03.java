package com.bootcoding.dsa.array;

public class Array_03 {

    public static void main(String[] args) {
        int a[] = {99, 85, 88, 80, 75, 59};
        System.out.println("Before Sorting:");
        for(int i = 0; i< a.length;i++){
            System.out.print(a[i] + ", ");
        }
        for(int i = 0; i < a.length; i++){
            for(int k = 1; k < a.length; k++){
                if(a[i] > a[k]) {
                    // Swapping
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting:");
        for(int i = 0; i< a.length;i++){
            System.out.print(a[i] + ", ");
        }
    }
}

