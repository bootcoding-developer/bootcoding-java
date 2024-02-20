package com.bootcoding.aug23;

public class ObjectReference {

    public static void main(String[] args) {
        Laptop dell = new Laptop();
        dell.price = 3000;
        dell.model = "Inspiron 234";
        dell.company = "DELL";
        Laptop.print(dell);
        // Second Reference of Same Object
        Laptop hp = dell;
        hp.price = 5000;
        hp.model = "Pavilion 234";
        hp.company = "HP";
        System.out.println("2 References pointing to same object");
        Laptop.print(dell);
        Laptop.print(hp);

        Laptop mac = new Laptop();
        mac.price= 7000;
        mac.model = "Mac Pro Apple Sillicon";
        mac.company = "Apple";
        Laptop.print(mac);

    }
}
