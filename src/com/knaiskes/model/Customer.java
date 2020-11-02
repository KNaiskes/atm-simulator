package com.knaiskes.model;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private double balance; // Could be changed to some other data type in order to store bigger numbers

    public Customer(String name, String lastName, String email, String password, double balance) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.balance = balance;
    }

    public Customer() {}

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() { return email; }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void print_customer(Customer customer) {
        System.out.println(customer.getName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getPassword());
        System.out.println(customer.getBalance());
    }
}
