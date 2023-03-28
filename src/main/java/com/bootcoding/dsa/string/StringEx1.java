package com.bootcoding.dsa.string;

public class StringEx1 {
    public static void main(String[] args) {
        // Escape Sequence
        String name = "KDKCE";
        String name2 = "kdkce";
        String address = "    Central Avenue Road    ";

        // trim()

        String addr = address.trim();
        System.out.println(" With Spaces : " + address);
        System.out.println(" Without Spaces : " + addr);

        // compare two strings - equals()
        boolean isSame = name.equalsIgnoreCase(name2);
        System.out.println(" KDKCE == kdkce ? " + isSame);
        boolean isSame2 = name.equalsIgnoreCase(name2);
        System.out.println(" KDKCE == kdkce ? (ignorecase) " + isSame2);

    }
}
