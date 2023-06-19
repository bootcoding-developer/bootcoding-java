package com.bootcoding.composition.book;

public class Book {
    private String title;
    private Author[] authors;
    private Publication publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publication getPublisher() {
        return publisher;
    }

    public void setPublisher(Publication publisher) {
        this.publisher = publisher;
    }
}
