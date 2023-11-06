package com.bootcoding.java.oops.factorial;

public class FactNumber {
    // Data Members
    int num; // input
    long fact = 1;

    // Member Method
    public long findFactorial(FactNumber fn){
        for(int i = 1; i <= fn.num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        FactNumber fn = new FactNumber();
        fn.num = 5;
        long result = fn.findFactorial(fn);
        System.out.println(result);
    }
}
