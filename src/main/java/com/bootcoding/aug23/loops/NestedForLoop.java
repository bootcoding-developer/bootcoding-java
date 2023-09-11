package com.bootcoding.aug23.loops;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= 5; k++){
                System.out.print(k + " " + i + ", ");
            }
            System.out.println();
        }
    }
}
