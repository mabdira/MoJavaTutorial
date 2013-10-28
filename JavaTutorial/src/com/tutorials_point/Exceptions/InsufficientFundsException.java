package com.tutorials_point.Exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: mabdira
 * Date: 6/30/13
 * Time: 5:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class InsufficientFundsException extends Exception{
    // data variables
    private double amount;

    // constructor
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    // getAmount method
    public double getAmount(){
        return this.amount;
    }
}
