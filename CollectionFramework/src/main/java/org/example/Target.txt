package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SavingAccount sav = new SavingAccount(162,876.23,"Sumit");
        sav.deposit(432);
        sav.withdraw(2000);
        sav.viewTransactionHistory();
    }
}