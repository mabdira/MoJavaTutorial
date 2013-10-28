package com.tutorials_point.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/30/13
 * Time: 5:20 PM
 * To change this template use File | Settings | File Templates.
 * This class demonstrate using our user-defined exception, the following CheckingAccount
 * class contains a withdraw() method that throws an InsufficientFundsException.
 */
public class CheckingAccount {
    // class data variables
    private double balance;
    private int number;

    /**
     * Checking Account Constructor
     * @param number Checking account number
     */
    public CheckingAccount(final int number){
        this.number = number;
    }

    /**
     * A deposit method to the checking account
     * @param amount Amount to deposit
     */
    public void deposit(final double amount){
        this.balance += amount;
    }

    /**
     * A withdraw method to the checking account
     * @param amount Amount to withdraw
     */
    public void withdraw(final double amount) throws InsufficientFundsException {
        if(amount <= balance){
            this.balance -= amount;
        }
        else{
            double needs = amount - this.balance;
            throw new InsufficientFundsException(needs);
        }
    }

    /**
     * Get the balance of the checking account
     * @return amount Balance amount
     */
    public double getBalance(){
        return this.balance;
    }

    /**
     * Get the account number of the checking account
     * @return number Checking account
     */
    public int getNumber(){
        return this.number;
    }

}