package org.example;

import java.util.ArrayList;

public class DoggieDayCare {
    private ArrayList<Dog> dogs;

    public DoggieDayCare(){
        dogs = new ArrayList<>();
    }

    public int checkIn(String name, int age, double weight, ArrayList<String> snacks){
        Dog d = new Dog(name, age, weight, snacks);
        dogs.add(d);
        return d.getID();
    }

    //checkout: takes in a name and an ID
    //GOAL: return the dog with that name and ID
            // or null, if no such dog exists
    public Dog checkOut(String name, int ID){
        for (int i = 0; i < dogs.size(); i++){
            Dog d = dogs.get(i);
            if (d.getName().toLowerCase().equals(name.toLowerCase())
                    && d.getID() == ID){
                //I know that dog is mine.
                dogs.remove(i);
                return d;
            }
        }
        return null;
    }

    // Given a snack, return a list of dog names who like that snack
    //Example:
        // given, HAM. return [ bigboi, tinytom ]

    public ArrayList<String> feedTheDogs(String snack){
        ArrayList<String> names = new ArrayList<>();
        for (Dog d : dogs){
            for (String like : d.getSnackList()){
                if (like.equals(snack)){
                    names.add(d.getName());
                }
            }
            /*
            if (d.getSnackList().contains(snack)){
                names.add(d.getName());
            }
            */
        }
        return names;
    }

    // findTheChonkers
    // Given a weight, return a list of dogs whose weight is greater than or equal to the param

    public ArrayList<Dog> findTheChonkers(double targetWeight){
        //init arraylist
        ArrayList<Dog> toReturn = new ArrayList<Dog>();
        //loop over dogs
        for (Dog d : dogs) {
            //check their weight to see if they're chonky
            if (d.getWeight() >= targetWeight) {
                //add them to the arraylist
                toReturn.add(d);
                //concurrentModificationError
            }
        }
        //return the list
        return toReturn;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Doggie Day Care Pups\n");
        for (Dog d : dogs){
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }

}
