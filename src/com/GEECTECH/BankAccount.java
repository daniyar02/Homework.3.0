package com.GEECTECH;

public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        amount = amount + sum;
    }

    public double withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ваш счет меньше " + amount, amount);
        }

            return amount -= sum;

        }

    }









