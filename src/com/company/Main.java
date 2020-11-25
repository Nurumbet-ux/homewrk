package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int constant = 6000;
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount(20000);
        while (true) {
            if (b.getAmount() <= 0) {
                break;
            } else if (b.getAmount() >= constant) {
                b.withDraw(constant);
            } else {
                try {
                    throw new LimitException("Недостаточно средств!", b.getAmount());
                } catch (LimitException e) {
                    System.out.println(e.getMessage() + "\nвы можете снять: " + e.getRemainingAmount());
                    System.out.println("сумма: " );
                    constant= sc.nextInt();
                }
            }
        }
    }
}



