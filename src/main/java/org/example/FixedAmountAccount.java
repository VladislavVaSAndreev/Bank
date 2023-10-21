package org.example;

public class FixedAmountAccount {
    private double amount;

    public void put(double value) {
        amount += value;
    }

    public void take(double value) {
        if (value > amount) {
            System.err.println("Не хватает денег");
        } else {
            amount -= value;
        }
    }

    public double put() {
        return 0;
    }

    public double take() {
        return 0;
    }

    public double getAmount() {
        return amount;
    }
}

