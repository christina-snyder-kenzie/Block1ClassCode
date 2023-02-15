package org.example;

public class InterfacePractice {
    public static void main(String[] args) {
        //use polymorphism to classify a bank account as a measurable thing
        Measurable thing = new BankAccount(1000);
        System.out.println(thing.getMeasure());
        //System.out.println(thing.deposit(200)); //doesn't work

        //we've got animals, right?
        //I want to populate a zoo with 5 animals
        //all animals a female and canMove
        //numLegs -> 0, 2, 4, 6, 8
        //i will be -> 0, 1, 2, 3, 4
        Measurable[] zoo = new Measurable[5];
        for (int i = 0;  i < 5; i++){
            //zoo[i] = new Animal("female", true, i*2);
        }

        //I wanna do a similar with bank accounts..
        //I want bankAccounts with 0, 1000, 2000, 3000, 4000 dollars
        Measurable[] accounts = new Measurable[5];
        for (int i = 0; i < 5; i++){
            accounts[i] = new BankAccount(i*1000);
        } //ends my for loop

        System.out.println("Total Legs: " + totalUp(zoo));
        System.out.println("Total balances: " + totalUp(accounts));
    } //ends my main method

    //GOAL #1: write a method to total up a measurable array
    //I want to retrieve the total measure of that array
    //basically the sum algorithm
    //should this method be static or nonstatic? (yes static)
    public static double totalUp(Measurable[] thingies){
        double bucket = 0;
        for (int i = 0; i < thingies.length; i++){
            Measurable dude = thingies[i];
            double valueToAdd = dude.getMeasure();
            bucket += valueToAdd;

            //bucket += thingies[i].getMeasure();
        }
        return bucket;
    }

} //ends the class
