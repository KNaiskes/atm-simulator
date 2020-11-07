package com.knaiskes;

import com.knaiskes.fakeDB.FakeDB;
import com.knaiskes.menu.Menu;
import com.knaiskes.model.Customer;


public class Main {

    public static void main(String[] args) {
        FakeDB fakeDB = new FakeDB();
        Menu menu = new Menu();

        Customer customer = new Customer( "Kiriakos", "Naiskes", "somemail@example.com","123", 100.43);
        Customer customer2 = new Customer( "Frodo", "Baggins", "frodo@example.com" ,"the one ring", 50.43);
        Customer loginCustomer = new Customer();

        fakeDB.addCustomer(customer);
        fakeDB.addCustomer(customer2);
        
        loginCustomer = fakeDB.login();

        if (loginCustomer != null) {
            menu.getCustomerOption();
        }
    }
}
