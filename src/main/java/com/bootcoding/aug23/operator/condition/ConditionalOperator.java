package com.bootcoding.aug23.operator.condition;

public class ConditionalOperator {
    // >, <  >=  <= ==  != Relational Operators
    public static void main(String[] args) {

        int x = 16;
        int y = 9;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y);


        if(x < y){
            // if block
            System.out.println(x + " < " + y);
        }else{
            System.out.println(x + " is not < " + y);
        }

        if(x != y){
            System.out.println(x + " != " + y);
        }
    }
}
