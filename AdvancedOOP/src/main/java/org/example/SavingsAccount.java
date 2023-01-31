package org.example;

import javax.swing.*;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate){
        //deposit(initBalance);
        //superclass and subclass
        super(initBalance);
        this.interestRate = interestRate;
    }

    //earnInterest()
    //GOAL: increase the balance by an amount (balance * interest)
    //what should it return? the interest amount..?
    public double earnInterest(){
        //interestAmount = balance * interestRate;
        //balance += interestAmount;
        //return interestAmount;
        double interestAmount = checkBalance() * interestRate;

        //INCOMING ROOKIE MISTAKE:
            //checkBalance() += interestAmount;
        //CORRECT answer:
        deposit(interestAmount);

        return interestAmount;
    }

    @Override
    public String toString(){
        String banksToString = super.toString();
        String myToString = "Savings " + banksToString;
        //myToString += ", Interest Rate: " + (interestRate * 100) + "%";
        myToString += String.format(", Interest Rate: %.2f%%", interestRate * 100);
        return myToString;
    }
}
