package com.bootcoding.aug23.operator;

public class PostPreIncrement {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int z = x++ + ++y; // L:8, z = 16, x = 10, y = 6
        // z = 16
        System.out.println(z); // L:10, z = 16, x = 11, y = 6
        int w = x + ++y;
        // w = 17
        System.out.println(w);
    }
}
// Post and Pre Operator
// 1. Evaluate expression x++ + ++y. Declare required variables with initial value
// 2. Evaluate expression ++x + ++y. Declare required variables with initial value
// 3. Evaluate expression x++ + y++. Declare required variables with initial value
// 4. Evaluate expression ++x + y++. Declare required variables with initial value
// 5. Evaluate expression x-- + --y. Declare required variables with initial value
// 6. Evaluate expression --x + --y. Declare required variables with initial value
// 7. Evaluate expression x-- + y++. Declare required variables with initial value
// 8. Evaluate expression ++x + --y. Declare required variables with initial value