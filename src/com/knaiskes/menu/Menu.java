package com.knaiskes.menu;

import com.knaiskes.fakeDB.FakeDB;
import com.knaiskes.model.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private String[] options = {
            "Withdraw money from your account",
            "Deposit money to your account",
            "View your balance",
            "Change your password"
    };
    private int selectOption;

    public Menu() {}

    public int getSelectOption() {
        return selectOption;
    }

    public void setSelectOption(int selectOption) {
        this.selectOption = selectOption;
    }

    public void getCustomerOption(Customer customer) {
        FakeDB fakeDB = new FakeDB();

        Scanner in = new Scanner(System.in);

        System.out.println("Select your option by entering its number");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + ": " +options[i]);
        }
        System.out.print("> ");
        try {
            selectOption = in.nextInt();
            this.setSelectOption(selectOption);

            switch(this.getSelectOption()) {
                case 1:
                    System.out.println("Withdraw");
                    fakeDB.withdraw(customer);
                    break;
                case 2:
                    System.out.println("Deposit");
                    fakeDB.deposit(customer);
                    break;
                case 3:
                    System.out.println("View Balance");
                    fakeDB.viewBalance(customer);
                    break;
                case 4:
                    System.out.println("Change password");
                    // Call changePassword function
                    break;
                default:
                    System.out.println(this.getSelectOption() + " is not a valid option");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer");
            this.getCustomerOption(customer);
        }
    }
}
