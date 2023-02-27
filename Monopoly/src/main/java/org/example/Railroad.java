package org.example;

import java.util.List;

public class Railroad extends Property{

    //make a call to super
    //make calc Rent
    //Know what our rents are
    //we need to know how many railroads an owner has

    public int calcNumRailRoadsForOwner(){
        //get all the properties from the bank
        //count the number of railroads
        //return that number
        List<Property> allOfThem = Bank.getInstance().getPropertiesForOwner(super.owner);
        int count = 0;
        for (Property p : allOfThem){
            if (p instanceof Railroad){//if p is-a Railroad
                count++;
            }
        }
        return count;
    }
}
