package com.bootcoding.java.array;

import com.bootcoding.java.book.Author;
import com.bootcoding.java.book.Book;
import com.bootcoding.java.book.Publication;

public class BookApp {
    public static void main(String[] args) {

        // Create Objects of dependent classes (Author and Publication)
        // Create object of Book

        Author prachi = new Author();
        prachi.setAge(18);
        prachi.setName("Prachi Alexander");

        Publication publisher = new Publication();
        publisher.setCompany("VBD");
        publisher.setAddress("Nagpur");
        publisher.setSince(1976);

        Book myBook = new Book();
        myBook.setTitle("How to crack Exam");
        myBook.setPublisher(publisher);

        Author[] authors = new Author[1];
        authors[0] = prachi;

//        myBook.setAuthors(authors);
    }
}
