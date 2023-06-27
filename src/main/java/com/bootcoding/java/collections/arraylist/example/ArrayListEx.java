package com.bootcoding.java.collections.arraylist.example;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] elements = new int[2];
        elements[0] = 10;
        elements[1] = 20;

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("hello");
        String hello = "hello";

        ArrayList<Integer> intData = new ArrayList<>();
        intData.add(10);
        intData.add(20);
//        intData.add("hello"); // gives compilation error

        for(int i = 0; i < intData.size(); i++){
            System.out.println(intData.get(i));
        }

    }
}
