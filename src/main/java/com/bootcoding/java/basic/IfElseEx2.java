package com.bootcoding.java.basic;

public class IfElseEx2 {
    public static void main(String[] args) {
        double percentage = 55.00;
        if(percentage >= 60){
            System.out.println(" I Division");
        }else if(percentage >= 50 && percentage < 60){
            System.out.println(percentage + "% is in II Division");
        }else{
            System.out.println(" III Division");
        }
    }
}
