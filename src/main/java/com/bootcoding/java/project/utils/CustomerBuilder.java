package com.bootcoding.java.project.utils;

import com.bootcoding.java.project.model.Customer;

import java.util.Random;

public class CustomerBuilder {
    private static Random random = new Random();

    public static Customer build() {
        Customer customer = new Customer();
        customer.setId(100 + random.nextInt(500));
        return customer;
    }
}
