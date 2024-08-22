package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
    String accountNumber;
    double balance;
    List<Transaction> transactions = new ArrayList<>();

    public Account(){
        this.accountNumber = UUID.randomUUID().toString();
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
