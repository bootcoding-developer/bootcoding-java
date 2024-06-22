package com.bootcoding.dsa.array;

public class Array_02 {
    public static void main(String[] args) {
        int arr[] = {99,85, 88, 80, 75, 59};
        int x = 75;
        boolean isFound = true;
        for(int i =0; i < arr.length; i++){
            if(x == arr[i]){
                System.out.println("Found!");
                isFound = false;
            }
        }
        if(isFound) {
            System.out.println("Not Found!");
        }
    }
}
