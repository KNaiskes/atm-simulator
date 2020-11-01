package com.knaiskes.fakeDB;

import com.knaiskes.model.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FakeDB {
    private Map<String, Customer> customersList = new HashMap<String, Customer>(); // Act as a database

    public FakeDB() {}

    public boolean customerExists(Customer customer) {
        try {
            if (!this.customersList.containsKey(customer.getEmail())) {
                return false;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Object is null");
        }
        return true;
    }

    public void addCustomer(Customer customer) {
        if (!this.customerExists(customer)) {
            this.customersList.put(customer.getEmail(), customer);
        }
        else {
            System.out.println("Customer with email: " + customer.getEmail() + " already exists");
        }
    }

    public void withdraw(Customer customer) {
        if (customer.getBalance() == 0) {
            System.out.println("Sorry, your account is empty!");
            return;
        }
        Scanner in = new Scanner(System.in);

        System.out.println("How much money would you like to withdraw ? :");
        int withdrawAmount = in.nextInt();

        while (withdrawAmount > (int)(customer.getBalance())) {
            System.out.println("This is more than your available balance");
            System.out.println("Do you want to try again? : Y/N");

            char tryAgain = in.next().charAt(0);
            if (tryAgain == 'n' || tryAgain == 'N') return;
            else withdrawAmount = in.nextInt();

            while(tryAgain != 'y' || tryAgain != 'Y' || tryAgain != 'n' || tryAgain != 'N') {
                System.out.println("Do you want to try again? : Y/N");
            }
        }

        customer.setBalance(customer.getBalance() - withdrawAmount);

        System.out.println("Your new balance is: " + customer.getBalance());
    }
}