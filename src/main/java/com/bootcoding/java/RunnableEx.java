package com.bootcoding.java;

import java.time.Duration;
import java.time.Instant;

public class RunnableEx {


    static class Task implements Runnable{

        @Override
        public void run() {
            printNumbers();
            printAlphabets();
        }

        private void printNumbers() {
            for(int i = 1; i< 10; i++){
                System.out.println(Thread.currentThread() + ": " +i);
            }
        }
        private void printAlphabets() {
            char[] alph = {'A', 'B', 'C', 'D', 'E'};
            for(int i = 0; i< alph.length; i++){
                System.out.println(Thread.currentThread() + ": " + alph[i]);
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            Thread t = new Thread(new Task());
            t.setName("T"+i);
            t.start();
        }
    }
}
