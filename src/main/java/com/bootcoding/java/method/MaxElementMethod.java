package com.bootcoding.java.method;

import java.util.Scanner;

public class MaxElementMethod {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of array");
            int n = scanner.nextInt();
            if(n < 0){
                break;
            }
            int[] arr = takeArrayFromUser(n, scanner);
            int res = 0;
            res = findMaxElement(arr); // argument (input) // output
            System.out.println("The Maximum Element is " + res);
        }
    }

    private static int[] takeArrayFromUser(int n, Scanner scanner) {
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter number at ["+ i +"]");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; //set by new max value
            }
        }
//        System.out.println(max);
        return max;
    }

}
