package com.bootcoding.java;

public class TypeCastingEx {
    public static void main(String[] args) {


        // Thread class
        // Runnable interface
       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {try{
               Thread.sleep(500);
           }catch (InterruptedException e){

           }
               startMyCar("Car 1",100000000);
           }
       });
       t1.setName("T1 thread");
       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {try{
               Thread.sleep(2000);
           }catch (InterruptedException e){

           }
               startMyCar("Car 2",1000000);
           }
       });
        t2.setName("T2 thread");
       Thread t3 = new Thread(new Runnable() {
           @Override
           public void run() {
               try{
                   Thread.sleep(1200);
               }catch (InterruptedException e){

               }
               startMyCar("Car 3", 10000000);
           }
       });

        t3.setName("T3 thread");
        t2.setPriority(1);
       t1.start();
       t2.start();
       t3.start();

    }

    private static void startMyCar(String msg, int count){

        System.out.println(Thread.currentThread());
        for(int i = 0; i<count; i++);
        System.out.println(msg);
        // Car has been started
    }
}







