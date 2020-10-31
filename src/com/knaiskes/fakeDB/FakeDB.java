package com.knaiskes.fakeDB;

import com.knaiskes.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    private Map<String, Customer> customersList = new HashMap<String, Customer>(); // Act as a database

    public FakeDB() {}

    public boolean customerExists(Customer customer) {
        try {
            if (!this.customersList.containsKey(customer.getEmail())) {
                System.out.println("Here?");
                return false;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Object is null");
        }
        return true;
    }

    public void addCustomer(Customer customer) {
        this.customersList.put(customer.getEmail(), customer);

        if (this.customerExists(customer) == false) {
            this.customersList.put(customer.getEmail(), customer);
        }
        else {
            System.out.println("Customer with email: " + customer.getEmail() + " already exists");
        }

    }
}