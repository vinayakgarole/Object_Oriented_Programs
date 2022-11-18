package com.bridgelabz;

import java.util.Scanner;

public class Account {

    private int balance;

    public Account(int initialBalance) {

        if (initialBalance > 0)
            balance = initialBalance;
    }

    public void credit(int amount) {
        balance = balance + amount;
    }

    public void debit(int debitAmount) {

        if (debitAmount > balance) {
            System.out.println("Debit amount exceeded amount balance: ");
        }
        balance = balance - debitAmount;
    }

    public int getBalance() {
        return balance;
    }
}

class AccountTest {

    public static void main(String[] args) {

        Account account = new Account(1000);
        System.out.println("Account Balance: " + account.getBalance());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount for Debit: ");
        int debitAmount = sc.nextInt();
        account.debit(debitAmount);

        System.out.println("Account balance: " + account.getBalance());
        System.out.println("Enter amount for Credit: ");
        int creditAmount = sc.nextInt();
        account.credit(creditAmount);
        System.out.println("Account Balance: " + account.getBalance());
    }
}