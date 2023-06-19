package com.bootcoding.composition.book;

public class TestApp {
    public static void main(String[] args) {


        // create book object
        Author a=new Author();
        Publication p=new Publication();
        Book b=new Book();
        a.setName("Kishore");
        a.setAge(40);
        System.out.print("Author name= "+a.getName());
        System.out.println(" Age = "+a.getAge());
        b.setTitle("JAVA REFERENCE");
        System.out.println(b.getTitle());
        b.setPublisher(p);
//        b.setAuthors(a);
    }
}
