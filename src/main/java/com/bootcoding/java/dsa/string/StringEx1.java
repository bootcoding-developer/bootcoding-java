package com.bootcoding.java.dsa.string;

public class StringEx1 {
    public static void main(String[] args) {
        String address = "    Central Avenue Road    ";
        String addr = address.trim();
        String[] words = addr.split(" ");
        char[] chars = addr.toCharArray();
        char ch = addr.charAt(0);
        int e = addr.indexOf('e');
        String replace = addr.replace("d", "dddd");
        String substring = addr.substring(0, 8);
        System.out.println(words.length);
        System.out.println(" With Spaces : " + address);
        System.out.println(" Without Spaces : " + addr);

    }
}
