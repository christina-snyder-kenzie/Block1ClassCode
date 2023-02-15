package org.example.demo;

public class Car extends Vehicle implements Rollable{
    private String color;

    public Car(int numPassengers, String color){
        super(numPassengers);
        this.color = color;
    }

    public void transport(){
        System.out.println("Driving to you!");
    }

    public String getColor(){
        return color;
    }

    public void roll(){
        System.out.println("Keep them wheels rolllllllllin");
    }


}
