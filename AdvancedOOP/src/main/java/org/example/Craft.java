package org.example;

import java.util.ArrayList;

public class Craft extends Activity {
    private ArrayList<Supply> suppliesNeeded;

    public Craft(String name){
        super(name);
        suppliesNeeded = new ArrayList<>();
    }

    //buySupplies
    //String name, int quantity
    //I will make the supply and add it to the list
    //What should I do if I have 10 pipe cleaners and I buy 5 more?
    //Should I:
        //Have TWO instances of pipecleaners
        //or should I combine them?
    public void buySupplies(String name, int quantity){
        Supply theOneWereBuying = new Supply(name, quantity);
        int location = suppliesNeeded.indexOf(theOneWereBuying);
        if (location == -1){
            //the supply is not in the list...
            suppliesNeeded.add(theOneWereBuying);
        } else {
            //I have this supply... so I need to update the quantity
            Supply existing = suppliesNeeded.get(location);
            existing.quantity += theOneWereBuying.quantity;
        }
    }

    public void doIt(){
        super.doIt();
        System.out.println("I'll need the following supplies:");
        for (Supply s : suppliesNeeded){
            System.out.println(s.name + ": " + s.quantity);
        }
    }

    //nested class
    class Supply{
        String name;
        int quantity;

        public Supply(String name, int quantity){
            this.name = name;
            this.quantity = quantity;
        }

        public boolean equals(Object other){
            if (this == other){
                return true;
            }
            if (other == null ||  ! (other instanceof Supply)){
                return false;
            }
            Supply otherSupply = (Supply) other;
            return this.name.equals(otherSupply.name);
        }
    }

} //ends the Craft class
