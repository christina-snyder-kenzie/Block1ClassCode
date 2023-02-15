package org.example;

public abstract class Animal implements Measurable{
    private String gender;
    private boolean canMove;
    private int numLegs;

    public Animal(String gender, boolean canMove, int numLegs){
        this.gender = gender;
        this.canMove = canMove;
        this.numLegs = numLegs;
    }

    public abstract Animal reproduce();

    public double getMeasure(){
        return numLegs;
    }

    public String getGender(){
        return gender;
    }

    public boolean getCanMove(){
        return canMove;
    }

    public int getNumLegs(){
        return numLegs;
    }

    public void eat(){
        System.out.println("NomNomNom Yummy!");
    }

    public void sleep(){
        System.out.println("ZZZzzzZZZzzz");
    }

    public void breathe(){
        System.out.println("Inhale Exhale");
    }

    public void migrate(){
        if (canMove){
            System.out.println("Let's go! New Home!");
        } else {
            System.out.println("I'm stuck here...");
        }
    }
} //ends the Animal class
/*
class Mammal extends Animal {
    //Animal(String gender, boolean canMove, int numLegs)
    //bodyTemp?
    //hairLength

    //reproduce()
    //catchAFever()
    //We snore when we sleep
}
*/


class Fish extends Animal{
    private String color;
    private double gillSize;
    private boolean canRegenerate;

    //RULE: in a subclass constructor, a call to super ALWAYS happens first
    //MORAL: WE must call super ourselves, with the right inputs
    public Fish(String gender, boolean canMove, String color, double gillSize, boolean canRegenerate){
        super(gender, canMove, 0);
        this.color = color;
        this.gillSize = gillSize;
        this.canRegenerate = canRegenerate;
    }

    public Animal reproduce(){
        System.out.println("Laying a bunch of eggs");
        return new Fish(getGender(), getCanMove(), this.color, this.gillSize * 0.10, this.canRegenerate);
    }

    public void swim(){
        System.out.println("Just keep swimming, Just keep swimming");
    }

    //the breathe method, we override to use our gills
    //by default, breathe() says inhale exhale
    //fish ADD TO THAT, "with my <x> inch gills".
    @Override
    public void breathe(){
        super.breathe(); //gonna inhale, exhale
        System.out.println("with my " + gillSize + " inch gills");
    }

} //ends the fish class

class Shark extends Fish {
    private int bloodDistance;

    //(String gender, boolean canMove, String color, double gillSize, boolean canRegenerate)
    public Shark(String gender, double gillSize, int bloodDistance){
        super(gender, true, "Grey", gillSize, true);
        this.bloodDistance = bloodDistance;
    }

    public void bite(){
        //if the shark is male, it's aggressive, so it chomps twice
        if (getGender().equals("male")){
            System.out.println("CHOMP!");
        }
        System.out.println("CHOMP!");
        eat(); //the same as this.eat() or super.eat()
    }

    //hunt -> Animal, distance
    //if that distance is close enough, and the animal can't move, then we bite it
    //if the distance is close enough, and the animal CAN move, 50% chance, we bite it.
    //other wise, they get away
    public void hunt(Fish hunted, int distance){
        if (distance > bloodDistance){
            System.out.println("The animal got away!");
        } else {
            if (hunted.getCanMove()){
                //50% chance
                if (Math.random() < .5){
                    bite();
                }
            } else {
                //the animal can't move
                bite();
                bite();
            }
        }
    }

}
