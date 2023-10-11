package com.bootcoding.java.composition.student;

public class StudentApp {
    public static void main(String[] args) {


        // What is Object creation
        // Actually Initialize its data members

        Subject sub = new Subject();
        sub.title = "Maths";
        sub.totalMarks = 100;
        sub.obtainedMarks= 45;
        Mobile mob = new Mobile();
        mob.company = "Samsung";
        mob.price = 43000;
        Student s = new Student();
        s.name = "Ramesh";
        s.rollNumber = 101;
        s.subject = sub;
        s.mobile = mob;

        System.out.println(s.rollNumber);
        System.out.println(s.name);
        System.out.println(s.subject.title);
        System.out.println(s.subject.totalMarks);
        System.out.println(s.subject.obtainedMarks);
        System.out.println(s.mobile.company);
        System.out.println(s.mobile.price);
    }
}
