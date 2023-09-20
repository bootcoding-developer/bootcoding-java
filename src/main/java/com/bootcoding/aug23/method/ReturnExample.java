package com.bootcoding.aug23.method;

public class ReturnExample {
    public static void main(String[] args) {
        addReturn(10, 20); // NOT Holding Return Value
        int res = addReturn(10, 20); // Holding Return Value to res variable
        System.out.println(res);
    }

    public static int addReturn(int a, int b){
        int c = a + b;
        System.out.println("Addition is " + c);
        return c;
    }


}
