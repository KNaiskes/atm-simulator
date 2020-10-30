package com.knaiskes.model;

public class Customer {
    private String name;
    private String lastName;
    private String password;
    private double balance; // Could be changed to some other type in order to store bigger numbers

    public Customer(String name, String lastName, String password, double balance) {
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void print_customer(Customer customer) {
        System.out.println(customer.getName());
        System.out.println(customer.getLastName());
        System.out.println(customer.getPassword());
        System.out.println(customer.getBalance());
    }
}
