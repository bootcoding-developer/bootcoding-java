package com.bootcoding.java;

public class CubeEvenNumber {

    public static void main(String[] args) {
        //WAM to print cube of all even numbers till given number
        printCubeOfEven(10);
        int number = maxNumber(10, 200, 5);
        System.out.println("Max Number is " + number);
         number = maxNumber(10, 3, 4);
        System.out.println("Max Number is " + number);
         number = maxNumber(10, 20, 33);
        System.out.println("Max Number is " + number);
    }

    // 10, 200, 5
    // 10, 3, 4
    // 10, 20 ,33 - > 33
    public static int maxNumber(int x, int y, int z){
        if(x >= y && x >= z){
            return x;
        }else if(y >= x && y >= z){
            return y;
        }
        return z;
    }
    public static void printCubeOfEven(int num){

        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                System.out.println("Cube of " + i + " = "+ i*i*i);
            }
        }
    }
}
