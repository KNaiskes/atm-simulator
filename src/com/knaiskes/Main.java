package com.knaiskes;

import com.knaiskes.fakeDB.FakeDB;
import com.knaiskes.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        FakeDB fakeDB = new FakeDB();
        Customer customer = new Customer( "Kiriakos", "Naiskes", "123", 100.43);
        Customer customer2 = new Customer( "Frodo", "Baggins", "the one ring", 50.43);

        fakeDB.addCustomer(customer);
        fakeDB.addCustomer(customer2);

    }
}
