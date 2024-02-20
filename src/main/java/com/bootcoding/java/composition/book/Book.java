package com.bootcoding.java.composition.book;

import java.security.PrivateKey;
import java.util.List;

public class Book {
    private String title;
    private String category;
    private List<Author> authors;
    private Publication publisher;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publication getPublisher() {
        return publisher;
    }

    public void setPublisher(Publication publisher) {
        this.publisher = publisher;
    }
}
