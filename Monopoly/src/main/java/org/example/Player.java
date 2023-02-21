package org.example;

public class Player {
    private String name;
    private int balance;
    private boolean hasLost;
    private int position;
    private String token;

    public Player(String name, String token){
        this(name, 1000, token);
    }

    public Player(String name, int balance, String token){
        this.name = name;
        this.balance = balance;
        hasLost = false;
        position = 0;
        this.token = token;
    }

    public boolean canBuyProperty(Property prop){
        // if we have enough money
        return balance >= prop.getCost();
    }

    public boolean equals(Object other){
        //reflexivity test (if I am the exact same as other)
        if (this == other){
            return true;
        }

        //non-nullity test (if other is null, we can't be the same)
        //if (other.equals(null)){ TERRIBLE
        // a NPE happens when I call a method upon an object which is null
        if (other == null){
            return false;
        }

        //type test
        if (! (other instanceof Player)){
            return false;
        }

        // at this point, we know:
            //other is not the same place in memory
            //other is not null
            //other IS A Player
        //type cast
        Player otherPlayer = (Player) other;

        return this.name.equals(otherPlayer.name) &&
                this.token.equals(otherPlayer.token);
    }

    public void payRentTo(Player other, int amt){
        if (other.equals(this)){
            //if I'm paying rent to myself. Quit out
            return;
        }
     //if I have enough money:
        if (balance > amt) {
            //my money should decrease
            balance -= amt;
            //other's money should increase
            other.balance += amt;
        } else {
            //else:
            //I give them what I have
            other.balance += this.balance;
            this.balance = 0;
            //and lose
            hasLost = true;
        }
    }

    public int rollDice(){
        //GOAL: Roll 2 six-sided dice
        int die1 = (int) (Math.random() * 6 + 1);
        int die2 = (int) (Math.random() * 6 + 1);
        return die1 + die2;
    }

    public static int rollDice(int numberOfDice){
        int runningTotal = 0;
        for (int i = 0; i < numberOfDice; i++){
            runningTotal += (int) (Math.random() * 6 + 1);
        }
        return runningTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isHasLost() {
        return hasLost;
    }

    public void setHasLost(boolean hasLost) {
        this.hasLost = hasLost;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void passGo(){
        Bank banker = Bank.getInstance();
        banker.distributeFunds(200, this);
    }

    public boolean makePurchase(int amt){
        if (amt > balance){
            return false;
        }
        balance -= amt;
        return true;
    }
}
