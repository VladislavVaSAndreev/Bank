package org.example;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getAmount());
        account.put(1000);
        account.take(10);
        System.out.println(account.getAmount());
        System.out.println("---------------");
//        FixedAmountAccount fixedAmountAccount = new FixedAmountAccount();
//        System.out.println(account.getAmount());
//        account.put(1000);
//        account.take(10);
//        System.out.println(account.getAmount());
    }
}