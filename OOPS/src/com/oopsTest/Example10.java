package com.oopsTest;
//Create an abstract class Accounts with the following details: 
//Data Members: (a) Balance (b) accountNumber (c) accountHoldersName (d) address Methods: (a) withdrawl()- abstract (b) deposit()- abstract (c) display() 
//to show the balance of the account number 
//Create a subclass of this class SavingsAccount and add the following details:

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHoldersName;
    protected String address;

    public abstract void withdrawal();
    public abstract void deposit();

    public void display() {
        System.out.println("Balance: " + 1200);
        System.out.println("Account Number: " + 12456789);
        System.out.println("Account Holder's Name: " + "pallavi shinde");
        System.out.println("Address: " + "N -Pune");
    }
}

class SavingsAccount extends Accounts {
    // Additional details specific to SavingsAccount

    @Override
    public void withdrawal() {
        // Implementation of withdrawal method for SavingsAccount
    }

    @Override
    public void deposit() {
        // Implementation of deposit method for SavingsAccount
    }
}

public class Example10 {
    public static void main(String[] args) {
        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount();

        // Call methods on the savingsAccount object
        savingsAccount.deposit();
        savingsAccount.withdrawal();
        savingsAccount.display();
    }
}
   

	


