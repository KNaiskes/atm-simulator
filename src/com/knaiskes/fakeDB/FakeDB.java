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

    public Customer login() {
        Customer loginCustomer = new Customer();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your email");
        System.out.print("> ");
        String getEmail = in.nextLine();
        // TODO: catch input exception
        loginCustomer.setEmail(getEmail);

        if (!this.customerExists(loginCustomer)){
            System.out.println("There is no user with such email");
            return null;
        }

        loginCustomer = this.customersList.get(getEmail); // get all values of the actual customer

        System.out.print("Enter your password ");
        System.out.print("> ");
        // TODO: catch input exception
        String getPassword = in.nextLine();

        // Could limit the number of tries and lock the account
        while(!loginCustomer.getPassword().equals(getPassword)) {
            System.out.println("Your password is incorrect");
            System.out.println("Try again or enter 'exit' to exit ");
            System.out.print("> ");

            getPassword = in.nextLine();
            if (getPassword.equals("exit")) return null;
        }
        return loginCustomer;
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
            else if (tryAgain == 'y' || tryAgain == 'Y') {
                System.out.println("How much money would you like to withdraw ? :");
                withdrawAmount = in.nextInt();
            }
        }

        customer.setBalance(customer.getBalance() - withdrawAmount);

        System.out.println("Your new balance is: " + customer.getBalance());
    }

    public void deposit(Customer customer){
        Scanner in = new Scanner(System.in);

        System.out.println("How much would you like to deposit in your account ? :");
        int depositAmount = in.nextInt();

        while (depositAmount <= 0) {
            System.out.println("Please, enter an amount of money greater than 0");
            depositAmount = in.nextInt();
        }
        customer.setBalance(customer.getBalance() + depositAmount);
        System.out.println("Your new balance is: " + customer.getBalance());
    }

    public void viewBalance(Customer customer) {
        System.out.println(customer.getBalance());
    }
}