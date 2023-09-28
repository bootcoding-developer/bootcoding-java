package com.bootcoding.aug23.array;

public class ArrayEx6 {

    public static void main(String[] args) {
        int[] a = {5, -3, 9, 8,15, 12};
        // print first half of array
        int size = a.length;
        for(int i = 0; i < size/2; i++){
            System.out.println(a[i]);
        }

        // print second half of array
        int c = 0;
        for(int k = size/2; k < size ;  k++){
            System.out.println(a[k]);
        }
        int i = size/2;
        while(i < size){
            System.out.println(a[i]);
            i++;
        }
        // Print alternate element of an array
        for(int j = 0; j < size; j += 2){
            System.out.println(a[j]);
        }
        int p = 0;
        for( ; p < size ; ){
            p++;
        }

    }
}
