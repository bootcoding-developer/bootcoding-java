package com.bootcoding.java.exception;

public class M5 {

    public static void m5() {
        System.out.println("I am in m5()");
        try{
            String dd = "dsjglsa";
            int d = 10 / Integer.parseInt(dd);
        } catch (Exception ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
