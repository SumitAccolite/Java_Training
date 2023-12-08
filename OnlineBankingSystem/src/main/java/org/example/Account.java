package org.example;

public class Account {
    private int accountId ;
    public String accountHolderName ;
    public double balance ;

    public Account(int accountId , String accountHolderName){
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;

    }

    public void getAccountId() {
        System.out.println(accountId);
    }

    public void getAccountHolderName() {
        System.out.println(accountHolderName);
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void deposit(){
    }
    public void withdraw(){

    }
}
