package com.bootcoding.java.memoization;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class FibonacciNumber {

    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        long start = System.nanoTime(); //System.currentTimeMillis()
        System.out.println(fib(25));
        System.out.println("Total Time (ns):" + (System.nanoTime() - start));
        long start2 = System.nanoTime();
        System.out.println(fibMemoization(25));
        System.out.println("Total Time (Memoization) (ns):" + (System.nanoTime() - start2));
    }
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static int fibMemoization(int n){
        if(n == 0 || n == 1){
            return n;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        cache.put(n, fibMemoization(n-1) + fibMemoization(n-2));
        return cache.get(n);
    }



}
