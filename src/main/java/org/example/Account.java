package org.example;

public class Account implements Bank{
    private double amount;
    public void put(double value) {
        amount += value;
    }
    public void take(double value) {
        if( value> amount){
            System.err.println("Не хватает денег");
        }else{
            amount-= value;
        }
    }

    @Override
    public double put() {
        return 0;
    }

    @Override
    public double take() {
        return 0;
    }

    public double getAmount(){
        return amount;
    }
    }
