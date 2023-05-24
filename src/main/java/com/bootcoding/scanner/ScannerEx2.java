package com.bootcoding.scanner;

import java.util.Scanner;

public class ScannerEx2 {

    // take array from user using Scanner
    public static void main(String[] args) {

        // first ask user a size of array
        // second ask to enter elements of an array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter Array Elements at index [" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        printEven(arr);
        printOdd(arr);
        printSumOfEven(arr);
        printSumOfOdd(arr);

    }



    public static void printEven(int[] elements){
        System.out.println("Printing input array: ");
        // print even elements of an array
        for(int i = 0; i < elements.length; i++){
            if(elements[i] % 2 == 0) {
                System.out.println(elements[i]);
            }
        }

    }
    public static void printOdd(int[] elements){
        System.out.println("Printing input array: ");
        // print even elements of an array
        for(int i = 0; i < elements.length; i++){
            if(elements[i] % 2 != 0) {
                System.out.println(elements[i]);
            }
        }

    }


    public static void printSumOfEven(int[] elements){
        System.out.println("Printing input array: ");
        // print even elements of an array
        int sum = 0;
        for(int i = 0; i < elements.length; i++){
            if(elements[i] % 2 == 0) {
                sum = sum + elements[i];
            }
        }
        System.out.println("Sum of even elements of an array : " + sum);

    }
    public static void printSumOfOdd(int[] elements){
        System.out.println("Printing input array: ");
        // print even elements of an array
        int sum = 0;
        for(int i = 0; i < elements.length; i++){
            if(elements[i] % 2 != 0) {
                sum = sum + elements[i];
            }
        }
        System.out.println("Sum of odd elements of an array : " + sum);

    }




}
