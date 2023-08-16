package com.bootcoding.java.string;

public class StringEx {
    public static void main(String[] args) {

        // Character Array
        // Array which holds multiple values
        int[] rollNos = {101, 102, 103};
        int[] ages = new int[5];

        char[] grades = {'A','B', 'C', 'D'};
        String text = "Student";
        String numbers = "23498834";
        String symbols = "$#$$*))@(#*)";
        String emailId = "username1Jan2023@gmail.com";


        //How to create String in Java
        String name = "SamSung"; // Samsung
        char[] chars = name.toCharArray();



        // [S,a,m,s,u,n,g]
        // [0,1,2,3,4,5,6]
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("S"));
        System.out.println(name.lastIndexOf("S"));


        // Comparison between 2+ strings
        String n1 = "ramesh";
        String n2 = "Ramesh";
        boolean equals = n1.equals(n2);
        System.out.println(n1 + " and " + n2 + " are same? = " + equals);


        String s1 = "Ramesh";
        String s2 = "Ganesh";

        if(s1.equals(s2)){
            System.out.println("Names are same!");
        }else{
            System.out.println("Names are different!");

        }
        // equals() - compare 2 strings
        String str1 = "Hello"; // SCP - String Constant Pool
        String str2 = "Hello";
        str2 = "Chello";
        System.out.println(str2);

        String technology = "Java C C++"; //break

        String[] array = technology.split(" ");

        System.out.println(array);









        // Split
        String[] split = technology.split(",");
        String date = "12/10/2023";
        String[] split1 = date.split("/");

        String[] textSplit = text.split(" ");
        String tech1 = "Java";
        String tech2 = "JAVA";
       // System.out.println("Java".equals(tech2));
        // WelcometoIndia
        // Substring() -- index substring(begin,end)



        String ram = "drRamesh";
        String dr2 = "dr";
        String concat = dr2.concat(ram);
        // substring() - beginIndex and endIndex
        String dr = ram.substring(0, 2);
        String ramesh = ram.substring(2, 8);
        System.out.println(dr);
        System.out.println(ramesh);
        // == -> Equality comparison
        // equals() -> Equality comparison
        // == - Compares References of 2 strings
        // equals() - compares values of 2 strings

        // split(",") - "HTML,CSS,MySQL,JAVA"
        //"HTML"
        //"CSS"
        //"MySQL"
        //"JAVA"

        // subString(beginIndex, lastIndex) - "SpringBoot"
        // subString(0,5) -> Spring


        //WAP to add a space after every characters of a given string while printing
        String input = "Java"; // J a v a
        char[] chars2 = input.toCharArray();
        for(int i = 0; i < chars2.length; i++){
            System.out.print((chars2[i] + "").toUpperCase() + " ");
        }

    }
}
