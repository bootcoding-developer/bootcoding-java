package com.bootcoding.java.basic.forloop;

public class ForEx1 {
    public static void main(String[] args) {
        int n = 10;
        // Print square of 1 to n;
        for(int i = 1; i <= n; i++){
            int square = i * i;
            //System.out.println(square);
        }
        // Print sum of 1 to n;
        // 1 + 2 + 3 +.... + n;
        int sum = 0;
        // Iteration 1; sum = 0, i = 1, sum=1, i++
        // Itr 2: sum = 1, i = 2, sum = 3, i++
        // Itr 3: sum = 3, i = 3, sum = 6, i++
        // Itr 4: sum = 6, i = 4, sum = 10, i++
        // Itr 5: sum = 10, i = 5, sum = 15, i++
        // i = 10
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
