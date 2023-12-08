package org.example;

public class SavingAccount extends Account implements TransactionHistory,OverdraftProtection{
    private int accountId ;
    public String accountHolderName ;
    public double balance ;

    public SavingAccount(int accountId, double balance ,String accountHolderName ) {
        super(accountId, accountHolderName);
        this.balance = balance ;

    }

    @Override
    public boolean applyOverdraftProtection(double amount) {
        if(amount > balance){
            return false ;
        }
        return true ;
    }

    public int count = 1000 ;
    public int temp = 100 ;
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Updated Balance after deposit is: " + balance);
        count++;
    }
    public void withdraw(double amount) {
        boolean overdraftProtection = applyOverdraftProtection(amount);
        if (overdraftProtection) {
            balance -= amount;
            System.out.println("Updated Balance after withdrawal is: " + balance);
            temp++;
        } else {
            System.out.println("Amount can't be withdrawn due to overdraft protection");
        }
    }
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
