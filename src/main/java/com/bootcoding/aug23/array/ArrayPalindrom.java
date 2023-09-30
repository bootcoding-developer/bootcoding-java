package com.bootcoding.aug23.array;

public class ArrayPalindrom {

    // Task: Print Palindrome elements of a given array

    // Breaking Tasks
    // 1) Find Palindrome of single number
    // 2) Take Array as input and Traverse
    // 3) Invoke Palindrome method while Traversing
    // 4) main()
    public static void main(String[] args) {
        int a[] = {5, 22, 232, 91};
        printPalindrome(a);
        copyArrayWithPalindrome(a);
    }

    public static int[] copyArrayWithPalindrome(int[] arr){
        int size = arr.length;
        int[] newArray = new int[size];
        for(int i = 0; i < size; i++){
            int n = arr[i];
            boolean palindrome = isPalindrome(n);
            if(palindrome){
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }
    public static void printPalindrome(int[] arr){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            int n = arr[i];
            boolean palindrome = isPalindrome(n);
            if(palindrome){
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean isPalindrome(int num){
        int org = num;
        int r = 0;
        while(num != 0){
            r = r * 10 + num % 10;
            num = num / 10;
        }
        return org == r;
    }
}

























