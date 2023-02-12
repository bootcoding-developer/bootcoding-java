package com.bootcoding.java;

public class DuplicateFinderUsingLinkedList {

    public static void main(String[] args) {

        int a[] = {100, 200, 300, 400, 500};
        printArray(a, 0);
    }

    private static void printArray(int[] a, int i) {
        if(i == a.length){
            return;
        }
        System.out.println(a[i]);
        printArray(a, ++i);
    }
}
