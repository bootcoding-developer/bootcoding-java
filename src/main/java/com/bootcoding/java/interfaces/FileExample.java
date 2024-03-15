package com.bootcoding.java.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File f = new File("./test.txt");
        f.createNewFile();
//        f.mkdir();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String line = "";
        System.out.println("File Contents: ");

        int count = 0;
        int pCount = 0;
        while( (line = br.readLine()) != null){
            System.out.println(line.trim());
            if(tagExists(line, "div")){
                count++;
            }
            if(tagExists(line, "p")){
                pCount++;
            }
        }

        System.out.println("<div> tags occurs " + (count/2) + " times.");
    }



    private static boolean divExists(String line){
        return line.contains("div");
    }
    private static boolean pExists(String line){
        return line.contains("p");
    }


    private static boolean tagExists(String line, String tag){
        return line.contains(tag);
    }

}
