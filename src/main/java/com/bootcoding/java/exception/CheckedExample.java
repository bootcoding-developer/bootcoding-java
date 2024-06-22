package com.bootcoding.java.exception;

import java.io.File;
import java.io.FileWriter;

public class CheckedExample {
    public static void main(String[] args) {
        File f = new File("");
        try{
            FileWriter fw = new FileWriter(f);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
