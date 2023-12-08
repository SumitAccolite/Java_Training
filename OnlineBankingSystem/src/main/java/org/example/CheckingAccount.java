package org.example;

public class CheckingAccount extends Account implements TransactionHistory{
    private int accountId ;
    public String accountHolderName ;
    public double balance ;

    public CheckingAccount(int accountId, double balance, String accountHolderName) {
        super(accountId, accountHolderName);
    }
    int count = 100 ;
    public void deposit() {
        count++ ;
    }

    int temp = 1000 ;

    @Override
    public void viewTransactionHistory() {
        if(count!=100){
            System.out.println("Deposit ID: "+count+" Balance: "+balance);
        }
        else{
            System.out.println("No Deposit History");
        }
        if(temp!=1000){
            System.out.println("Transaction ID: "+temp+" Balance: "+balance);
        }
        else{
            System.out.println("No Transaction History");
        }
    }
}