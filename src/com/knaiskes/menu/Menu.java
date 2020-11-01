package com.knaiskes.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private String[] options = {
            "1: Withdraw money from your account",
            "2: Deposit money to your account",
            "3: View your balance",
            "4: Change your password"
    };
    private int selectOption;

    public Menu() {}

    public int getSelectOption() {
        return selectOption;
    }

    public void setSelectOption(int sellectOption) {
        this.selectOption = sellectOption;
    }

    public void getCustomerOption() {
        Scanner in = new Scanner(System.in);

        System.out.println("Select your option by entering its number");
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
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
