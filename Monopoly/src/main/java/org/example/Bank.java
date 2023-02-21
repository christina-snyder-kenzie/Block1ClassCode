package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    //1. Private static instance
    //2. Private constructor
    //3. Public static getter

    private static Bank instance;
    private List<Property> properties;
    private int numHouses, numHotels, availableMoney;

    private Bank(){
        //the job is still to initialize properties
        properties = new ArrayList<>();
        loadProperties();
        numHouses = 25;
        numHotels = 10;
        availableMoney = 12000;
    }

    public List<Property> getPropertiesForOwner(Player p){
        //could we loop over properties and find all the ones
        //whose owner is player p?
        //basket
        ArrayList<Property> owned = new ArrayList<Property>();
        //loop
        for (Property prop : properties) {
            //if statement
            //how do I know if player p owns the property?
            //player p owns the property if the property's owner is p
            if (prop.getOwner().equals(p)){
                //update
                owned.add(prop);
            }
        }
        //return
        return owned;
    }


        //can I always distribute the amt?
        //can the bank run out of money????
            //(yes)

        //I will either: give the player amt, OR give the rest of the available money
        // Math.min(a, b) -> the smaller one
        // Math.max(a, b) -> the bigger one

        //What I need |vs| What the bank has |vs| what I get
        // 100                  12000               100
        // 3000                 12000               3000
        // 3000                 50                  50
        // 200                  50                  50

        //int whatIget = Math.min(whatINeed, WhatTheBankHas);
    public void distributeFunds(int amt, Player p){
        int realAmount = Math.min(amt, availableMoney);
        p.setBalance(p.getBalance() + realAmount);
        availableMoney -= realAmount;
    }

    public int getNumProperties(){
        return properties.size();
    }

    public Property getProperty(int index){
        return properties.get(index);
    }

    public void loadProperties(){
        //TODO: make properties
        //we can't do yet, because we don't have concerete properties...
    }

    public static Bank getInstance(){
        if (instance == null){
            instance = new Bank();
        }
        return instance;
    }
}
