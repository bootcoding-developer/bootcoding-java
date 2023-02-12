package com.bootcoding.java;

import java.util.Scanner;

public class MethodExample {


    // Method is block of statements
    // int a = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = sc.nextInt();
        int sum = findArmstrong(number);
        if(number == sum){
            System.out.println(number + " is armstrong number!");
        }else{
            System.out.println(number + " is not an armstrong number!");
        }
    }

    // return (output)
    // Method Definiation
    // No Parameter Method
    // Parametrized Method
    public static int findArmstrong(int number){ // parametr defined
        int temp = number;
        int rem = 0;
        int sum = 0;
        while(temp != 0){
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
       return sum;
    }


    // syntax
}

// 1) WAM to get boolean value on whether input number is even or not
// Ex: boolean isEven(int number){ ... }
// 2) WAM to get boolean value on whether input number is odd or not
// Ex: boolean isOdd(int number){ ... }
// 3) WAM to return max number among three numbers
// Ex three parameters to a method, method_name : maxNumber(...)
// 4) WAM to return min number among three numbers
// 5) WAM to print natural numbers upto given number (NO Return)
// Ex: n = 10, Print: 1,2,3,4,5,6,7,8,9,10
// 6) WAM to print all even numbers till given number (NO Return)
// 7) WAM to print all odd numbers till given number (NO Return)
// 8) WAM to print cube of all even numbers till given number (NO Return)
// 9) WAM to print cube of all odd numbers till given number (NO Return)
// 10) WAM to calculate palindrome number from given number (Use Return)
