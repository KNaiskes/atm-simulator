package com.knaiskes;

import com.knaiskes.model.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer( "Kiriakos", "Naiskes", "123", 100.43);
        customer.print_customer(customer);
    }
}
