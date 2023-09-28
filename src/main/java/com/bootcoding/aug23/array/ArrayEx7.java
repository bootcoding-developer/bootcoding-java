package com.bootcoding.aug23.array;

public class ArrayEx7 {

    // Full Copy Array
    public static void main(String[] args) {
       int[] a = {5, 10, 15, 20, 25}; // D + I
       copyArray(a);
        int[] ab = {-15,-20}; // D + I
        copyArray(ab);
        int[] abc = {0,0,0}; // D + I
        copyArray(abc);

    }
    // Full Copy Array using Method
    public static void copyArray(int array[]){
        int b[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            b[i] = array[i];
        }
        printArray(array);

    }

    public static void printArray(int furr[]){
        for(int i = 0; i < furr.length; i++){
            System.out.print(furr[i] + " ");
        }
        System.out.println();
    }
}
