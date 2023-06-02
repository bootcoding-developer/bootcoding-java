package com.bootcoding.service.multi;

public class MultiplicationTableService {

    public long[] getMultiplicationTable(int num){
        long[] table = new long[10];
        for(int i = 0; i < 10; i++){
            table[i] = num * (i + 1);
        }
        return table;
    }
}
