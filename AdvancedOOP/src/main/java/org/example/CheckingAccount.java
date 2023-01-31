package org.example;

public class CheckingAccount extends BankAccount {
    private int maxNumWithdraws, currWithdraws;

    public CheckingAccount(){
        super(200); //Must come FIRST in the constructor
        maxNumWithdraws = 5;
        currWithdraws = 0;
    }

    public CheckingAccount(double initBalance, int maxNumWithdraws){
        super(initBalance + 200);
        this.maxNumWithdraws = maxNumWithdraws;
        currWithdraws = 0;
    }

    //situations:
    //It's my first withdrawal, and I ask for money that I have
        //result here: should be:
            //1. Balance is updated
            //2. currWithdraws is increased
            //3. return true
    //It's my first withdrawal, but I ask for more money than I have
        //result here?
            //return false
            //what happens to currWithdraws? -> If I don't get money, should it count? (Colin says no.)
    //Its' my nth (7th) withdrawal, and I ask for money that I have:
        //result here?
            //if the limit hasn't been reached, it succeeds
            //if the limit HAS been reached? -> return false
    @Override
    public boolean withdraw(double amount){
        if (currWithdraws < maxNumWithdraws){
            //we can try
            boolean result = super.withdraw(amount);
            if (result){
                currWithdraws++;
                return true;
            } else {
                System.out.println("Insufficient Funds");
                return false;
            }
        } else {
            //no more withdraws left this month...
            System.out.println("No more withdraws left");
            return false;
        }
    }



}
