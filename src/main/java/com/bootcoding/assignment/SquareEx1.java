package com.bootcoding.assignment;

public class SquareEx1 {

    public static void main(String[] args) {

        for(int k = 2; k <= 100; k++){
            if(k % 3 == 0 && k % 5 == 0){
                System.out.println(k * k);
            }
        }
    }
}