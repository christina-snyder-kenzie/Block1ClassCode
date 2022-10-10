package org.example;

public class DogPark {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bruce";
        dog.weight = 100;
        dog.breed = "Chihuahua";
        dog.color = "Black";

        dog.sleep();

        double weight = dog.eat();
        System.out.println("Weight after eating: " + weight);

        //System.out.println(dog.introduceMyself());
        //dog.introduceMyself();
        dog.introduceMyself();

        Dog dog2 = new Dog("Carrie", 22, "Mut", "Black");
        /*dog2.name = "Carrie";
        dog2.weight = 22;
        dog2.breed = "Mut";
        dog2.color = "black";*/

        Dog dog3 = new Dog("Cindy", 37, "Brown");
        System.out.println(dog3.breed);

        //Dog dog4 = new Dog("copper", 12, "Chihuahua");
    }
}
