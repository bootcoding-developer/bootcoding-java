package com.bootcoding.project.utils;

import java.util.Random;

public class CityGenerator {
    private static String[] names =
            {"Nagpur", "Wardha", "Bhandara", "Ramtek", "Jabalpur", "Hyderabad", "Pune"};

    public static String getName() {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args) {
        CityGenerator.getName();
    }
}

