package com.bootcoding.aug23.ifs;

import java.util.Scanner;

public class DivisiblityBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println(n + " is divisible by 3 & 5!");
        }else{
            System.out.println(n + " is NOT divisible by 3 & 5!");
        }
    }
}
