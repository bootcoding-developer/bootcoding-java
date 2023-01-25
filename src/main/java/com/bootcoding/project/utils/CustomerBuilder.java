package com.bootcoding.project.utils;

import com.bootcoding.project.model.Customer;

import java.util.Random;

public class CustomerBuilder {
    private static Random random = new Random();

    public static Customer build() {
        Customer customer = new Customer();
        customer.setId(100 + random.nextInt(500));
        return customer;
    }
}
