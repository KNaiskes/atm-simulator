package com.knaiskes.fakeDB;

import com.knaiskes.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    private Map<String, Customer> customersList = new HashMap<String, Customer>(); // Act as a database

    public FakeDB() {}

    public void addCustomer(Customer customer) {
        this.customersList.put(customer.getName(), customer);
    }
}