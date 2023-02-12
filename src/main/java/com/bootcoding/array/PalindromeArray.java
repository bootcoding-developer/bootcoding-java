package com.bootcoding.array;

public class PalindromeArray {
    public static void main(String[] args) {
        // Print only Palindrome element of an array
        int[] a = {10,11, 121, 153, 4334};
        System.out.println("Palindrome elements of an array: ");
        for(int index=0; index < a.length; index++){
            int num = a[index];
            int r = 0;
            while(num != 0){
                r = r * 10 + num % 10;
                num = num / 10;
            }
            if(r == a[index]){
                System.out.println(r);
            }
        }
    }
}

// WAP to print cube of each element of an array

// WAP to print multiplication table of array element
// hint - nested for loop

// WAP to print after converting minute to seconds of an array
//[4, 11, 23] -> seconds