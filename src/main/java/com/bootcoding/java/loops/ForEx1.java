package com.bootcoding.java.loops;

public class ForEx1 {
    public static void main(String[] args) {
        // Loops
        // for(initial value; condition; increment)
        // 1.Declare, 2.Condition, 3.Increment/Decrement
       int n = 20;
       for(int i = 1; i <= 20; i++){
           if(i % 2 == 0){
               System.out.println(i + " is Even Number!");
           }else{
               System.out.println(i + " is Odd Number!");
           }
       }
    }
}
