package com.bootcoding.hashtable;

import java.util.HashMap;

public class HashTableExample {

    public static void main(String[] args) {
        int a[] = {10, 20, 10, 30, 20, 40};
        // Find duplicate elements in an array

        // int, char, double, string, boolean
        // Integer, Character, Double, String, Boolean, Float, Short, Long, Byte
        // Type of data -
        // key-value

        HashMap<Integer, Integer> store = new HashMap<>();
        HashMap<Double, Integer> s = new HashMap<>();
        HashMap<String, Integer> s2 = new HashMap<>();

        for(int i = 0; i < a.length; i++){
            if(store.containsKey(a[i])) {
                int value = store.get(a[i]);
                store.put(a[i], value + 1);
            }else {
                store.put(a[i], 1);
            }
        }
        for(Integer key : store.keySet()){
            int value = store.get(key); // no of occurrences
            if(value > 1){
                System.out.println(key);
            }
        }
    }
}
