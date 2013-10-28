package com.tutorials_point.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/30/13
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 * The following BankDemo program demonstrates invoking the deposit() and
 * withdraw() methods of CheckingAccount.
 */
public class BankDemo {
    /**
     * The main method for the BankDemo program
     * @param args
     */
    public static void main(String[] args){
        // create a new checking account
        CheckingAccount checkAcc = new CheckingAccount(10101);

        // deposit $500
        System.out.println("Depositing $500 to account number: " + checkAcc.getNumber());
        checkAcc.deposit(500.00);

        // withdraw money from the checking account
        try {
            System.out.println("\nWithdrawing $100 from account number: " + checkAcc.getNumber());
            checkAcc.withdraw(100.00);
            System.out.println("\nWithdrawing $600 from account number: " + checkAcc.getNumber());
            checkAcc.withdraw(600.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short of $" + e.getAmount());
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
