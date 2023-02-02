package org.example;

public class AnimalKingdom {
    public static void main(String[] args) {
        Animal carrie = new Animal("Female", true, 4);
        carrie.eat();
        carrie.sleep();
        carrie.breathe();
        carrie.migrate();
        System.out.println("------------");
        Fish patrick = new Fish("Male", true, "Pink", 1, true);
        patrick.eat();
        patrick.sleep();
        patrick.breathe();
        patrick.migrate();
        patrick.swim();

        System.out.println("------------");
        Animal bandit = patrick;
        bandit.eat();
        bandit.breathe(); //Do I use my gills?
        //bandit.swim(); //Can't swim
        ( (Fish) bandit).swim(); //works, but DANGEROUS

        Animal copper = carrie; //carrie is an Animal, now copper is a copy
        ( (Fish) copper).swim(); //DANGER
    }
}
