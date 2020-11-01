package com.knaiskes.menu;

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

    public void getCustomerOption() {
        Scanner in = new Scanner(System.in);

        System.out.println("Select your option by entering its number");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + ": " +options[i]);
        }
        System.out.print("> ");
        try {
            selectOption = in.nextInt();;
            this.setSelectOption(selectOption);
            System.out.println("Here: " + this.getSelectOption());
        } catch (InputMismatchException e) {
            System.out.println("Input must be an integer");
            this.getCustomerOption();
        }
    }
}
