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
        Scanner sc = new Scanner(System.in);
        if (this.amount >=sum){
            this.amount -=sum;
        }else{
            try {
                throw new LimitException("Недостаточно средств!",this.amount);
            } catch (LimitException e) {
                System.out.println(e.getMessage()+"\nвы можете снять: "+e.getRemainingAmount());
                System.out.println("сумма: ");
                Main.constant = sc.nextInt();

            }
        }

    }

}

