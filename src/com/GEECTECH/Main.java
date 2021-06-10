package com.GEECTECH;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("На вашем счете " + bankAccount.getAmount() + " сом");


        while (true) {
            try {
                System.out.println(bankAccount.withDraw(6000));


            } catch (LimitException e) {
                System.out.println("На вашем счете " + e.getRemainingAmount() + "сом cнята остаток "
                        + e.getRemainingAmount() + "." + "Оставшая сумма = "
                        + (e.getRemainingAmount() - e.getRemainingAmount()));
                break;
            }
        }
    }
}
