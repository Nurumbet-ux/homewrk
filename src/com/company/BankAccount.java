package com.company;

import java.util.Scanner;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount +=sum;
    }
    public void withDraw(int sum){
        this.amount-=sum;
    }

}

