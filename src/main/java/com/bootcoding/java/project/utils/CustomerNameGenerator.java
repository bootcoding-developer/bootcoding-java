package com.bootcoding.java.project.utils;

import java.util.Random;

public class CustomerNameGenerator {
    private static final String[] names = {
            "Ramesh", "Suresh", "Ganesh", "Dinesh", "Mangesh", "Jayesh", "Pooja", "Shree", "Amrita", "Atul", "Sujal",
            "Sakshi", "Namrata", "Shilpa", "Ashwini", "Nikhil", "Manjit", "Sodi", "Aryan", "Sumit", "Sarang"};

    private static Random random = new Random();

    public static String getName(){
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(CustomerNameGenerator.getName());
        }
    }

    public int binarySearch(int[] a, int low, int high, int x){

        if(low > high){
            return -1;
        }

        int mid = low + (high-low) / 2;
        if(a[mid] == x){
            return mid;
        }
        if(a[mid] > x){
            return binarySearch(a, low, mid-1, x);
        }else{
            return binarySearch(a, mid+1, high, x);
        }
    }
}
