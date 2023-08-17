package com.bootcoding.java.string;

// Immutable class - can not be change
// Performance
public class StringBuilderEx {

    // Task Technology
    // C,C++,Java,SQL
    // [C],[C++],[Java],[SQL]

    public static void main(String[] args) {
        String technology = "C,C++,Java,SQL";
        //SPlit by comma
        // Wrap in square bracket [Technology]
        // Comma append
        // Creating object of StringBuilder
        StringBuilder sb = new StringBuilder();
        String[] tokens = technology.split(",");
        for(int i = 0; i < tokens.length; i++){
            String tech = tokens[i];
            sb.append("[");
            sb.append(tech);
            sb.append("]");
            sb.append(",");
            System.out.println("[" + tech + "]");
        }
        String outputStr = sb.toString();
        System.out.println(outputStr);

        StringBuffer sbuffer = new StringBuffer();
        String[] t = technology.split(",");
        for(int i = 0; i < tokens.length; i++){
            String tech = tokens[i];
            sbuffer.append("[");
            sbuffer.append(tech);
            sbuffer.append("]");
            sbuffer.append(",");
            System.out.println("[" + tech + "]");
        }
        String ostr = sb.toString();
        System.out.println(ostr);
    }

}
