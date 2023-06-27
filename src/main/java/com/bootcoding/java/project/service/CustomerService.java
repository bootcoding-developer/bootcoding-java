package com.bootcoding.java.project.service;

import com.bootcoding.java.project.model.Customer;
import com.bootcoding.java.project.utils.*;

public class CustomerService {

    public Customer createCustomer() {
        Customer customer = new Customer();
        customer.setName(CustomerNameGenerator.getName());
        customer.setCity(CityGenerator.getName());
        customer.setEmailId(EmailIdGenerator.getEmailId(customer.getName()));
        customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
        customer.setDeliveryAddress(AddressGenerator.getAddress());
        return customer;
    }

    public void print(Customer customer) {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer EmailId: " + customer.getEmailId());
        System.out.println("Customer City: " + customer.getCity());
        System.out.println("Customer DeliveryAddress: " + customer.getDeliveryAddress());
        System.out.println("Customer PhoneNumber: " + customer.getPhoneNumber());
    }

    public static void main(String[] args) {

        CustomerService cs = new CustomerService();
        for(int i = 0; i < 50; i++){
            Customer customer = cs.createCustomer();
            cs.print(customer);
        }

    }

    //
}
