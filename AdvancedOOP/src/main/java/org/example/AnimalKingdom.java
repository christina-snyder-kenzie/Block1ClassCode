package org.example;

public class AnimalKingdom {
    public static void main(String[] args) {
        /*
        No longer allowed because
        One CANNOT Instantiate an abstract class
        You cannot say  = new AbstractClass();
        Animal carrie = new Animal("Female", true, 4);
        carrie.eat();
        carrie.sleep();
        carrie.breathe();
        carrie.migrate();
        */
        System.out.println("------------");
        Fish patrick = new Fish("Male", true, "Pink", 1, true);
        patrick.eat();
        patrick.sleep();
        patrick.breathe();
        patrick.migrate();
        patrick.swim();

        System.out.println("------------");
        Animal bandit = new Fish("Male", true, "Pink", 1, true);;
        bandit.eat();
        bandit.breathe(); //Do I use my gills?
        //bandit.swim(); //Can't swim
        ( (Fish) bandit).swim(); //works, but DANGEROUS
        System.out.println(bandit.reproduce());

        /*Animal copper = carrie; //carrie is an Animal, now copper is a copy
        ( (Fish) copper).swim(); //DANGER*/
    }
}
