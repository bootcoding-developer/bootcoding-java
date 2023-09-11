package com.bootcoding.aug23.operator;

public class PostPreIncrement {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

//        // ++ Increment Operator
//        x++; // Post Increment Operator
//        ++x; // Pre Increment Operator
//
        // PreIncrement Example
        // y = ++x;
        // 1. Incrementing value of x
        // 2. Assigning value of x to y. = 11

        // PostIncrement Example
        //y = x++;
        // 1. Assigning value of x to y. = 10
        // 2. Incrementing value of x

        y = ++x + x++;
        // 1. ++x -> x = 11
        // 2. Addition of 11 + 11 = 22
        // 2. Assigning value of x to y. = 22
        // 3. x++ -> x = 12

        System.out.println(y);
        System.out.println(x);























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