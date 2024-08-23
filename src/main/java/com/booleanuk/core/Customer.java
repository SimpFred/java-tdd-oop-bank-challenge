package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;
    private Bank bank;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public boolean requestCurrentAccount() {
        return bank.createCurrentAccount(this);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
