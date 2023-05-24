package com.bootcoding.array;

public class StringSplitEx {
    public static void main(String[] args) {

        String technologies = "java,c,c++,python,html";
        // split by comma
        String[] words = technologies.split(",");

        System.out.println("Candidate knows total " + words.length + " technologies");
        for(int k = 0; k < words.length; k++){
            System.out.print(words[k].toUpperCase() + " | ");
            // print same line, println print karne ke baad \n newline add karta
        }

        String filepath = "/Users/bootcoding/bootcoding-services/bootcoding-work/product-work/github-work/bootcoding-product";
        String[] folders = filepath.split("/");
        System.out.println("\nTotal folders in given path is " + folders.length);

        String data = "The-data-table-that-we-have-been-presenting-receives";
        String[] tokens = data.split("t");
        System.out.println("Total words in given data is " + tokens.length);

        // try with double quote (escape sequence)
        String quote = "[columns]=\"columns\"";
        System.out.println(quote);
    }
}
