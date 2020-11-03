package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setDeposit(double sum) {
        amount += sum;
        System.out.println("Your balance "+ getAmount());
    }

    public void getWithdraw(int x) throws LimitedException {
        if (x > amount) {
            throw new LimitedException("You have reached your limit");
        }
        amount = amount - x;
        System.out.println("You took off "+x);
    }
}
