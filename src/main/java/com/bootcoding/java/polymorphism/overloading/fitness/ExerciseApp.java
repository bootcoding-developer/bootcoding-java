package com.bootcoding.java.polymorphism.overloading.fitness;

import java.util.Calendar;
import java.util.Date;

public class ExerciseApp {
    public static void main(String[] args) {
        HumanExercise he = new HumanExercise();
        he.run();
        he.print();


//        he.run(30);
        he.print();

        Calendar c = Calendar.getInstance(); // starts with today's date and time
        c.add(Calendar.DAY_OF_YEAR, 2);  // advances day by 2
        Date date = c.getTime(); // gets modified time
//        he.run(date);
        he.print();
    }
}
