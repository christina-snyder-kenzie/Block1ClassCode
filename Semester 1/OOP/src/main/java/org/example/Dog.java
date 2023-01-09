package org.example;

public class Dog {
    //Properties
        //breed
        //size/weight
        //name
        //color
        //age
        //gender
    public String name, breed, color;
    public double weight;

    //Constructors
    //FORMAT:
    //accessModifier ClassName(dt1 varName1, d2 varName2, etc){ }
    public Dog(String n, int w, String b, String c){
        //the job of a constructor, is to initialize properties
        name = n;
        weight = w;
        breed = b;
        color = c;
    }

    public Dog(String n, int w, String c){
        name = n;
        weight = w;
        color = c;
        breed = "mixed"; //"default"? value
    }

    /*
    PROBLEMATIC: Because parameter data types are not different
    public Dog(String n, int w, String b){
    }
    */


    public Dog() {

    }

    //Behavior
        //sleep
        //whine
        //eat
        //bark
        //zoomies
        //play/dig/fetch
        //protect
        //introduceThemselves


    //GOAL: Write a method that introduces the dog
        //Hello my name is <name>
            //depending on the breed, we tack on another statement
                //lab ->  and I love you very much
                //chihuahua -> And now you can back off
                //bulldog -> and now I'll go back to sleep, actually call the sleep method
    //question: Should this method be void, or should it return a string?
    public void introduceMyself(){
        System.out.print("Hello my name is " + name);

        if (breed.equalsIgnoreCase("lab")){
            System.out.println(" and I love you very much!");
        } else if (breed.equalsIgnoreCase("chihuahua")){
            System.out.println(" and now you can back off...");
        } else if (breed.equalsIgnoreCase("bulldog")){
            System.out.println(" and now I'll go back to sleep");
            sleep();
            sleep();
            sleep();
        } else {
            System.out.println("!!!");
        }
    }

    //GOAL: to code a sleep method
        //Maybe all dogs "ZzZzZzZz"
        //but big dogs, also snore
    public void sleep(){
        System.out.println("ZzZzZzZz");
        if (weight > 50 || breed.equalsIgnoreCase("pug")){
            System.out.println("Snore, Snore, Snore");
        }
    }

    //eating, increases your weight by 1%
    //print out chomp chomp chomp
    //returns the new weight
    public double eat(){
        weight *= 1.01;
        System.out.println("Chomp chomp CHOMP");
        return weight;
    }


}
