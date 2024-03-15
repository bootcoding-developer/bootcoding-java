package com.bootcoding.java.exception;

import com.bootcoding.java.composition.book.Book;

public class NullPointerExample {
    public static void main(String[] args) {
        Book b = new Book();
        Book b2 = null;
        String title = b.getTitle(); // null
        System.out.println(b2.getTitle());

        // NPE triggers when you are trying to access
        // property or method of null object.
    }
}
