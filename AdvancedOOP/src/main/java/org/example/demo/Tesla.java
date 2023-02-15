package org.example.demo;

public class Tesla extends Car implements Electric{
    //who is my super?
        //what goes in that call to super?
    public Tesla(int numPassengers, String color){
        super(numPassengers, color);
    }

    //what methods do I need from Electric?
    public void charge(double amountOfTime){
        System.out.println("we're charging woo");
    }

    public void makeSound(){
        System.out.println("hmmmmmmmmm");
    }
}
