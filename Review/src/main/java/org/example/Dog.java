package org.example;

import java.util.ArrayList;

public class Dog {
    // properties
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> snackList;
    private int ID;

    // constructor
    public Dog(String name, int age, double weight, ArrayList<String> snackList){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.snackList = snackList;
        ID = generateID();
    }

    private int generateID(){
        //4 digit number with random digits
        // ####
        // [a, b] -> (int) (Math.random() * (b - a + 1) + a);
        // 0-9 -> 7?
        // [1000, 9999] -> 2331

        int multiplier = (9999 - 1000 + 1);
        int randomNumber = (int) (Math.random() * multiplier + 1000);
        return randomNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<String> getSnackList() {
        return snackList;
    }

    public int getID() {
        return ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addSnack(String newSnack){
        snackList.add(newSnack);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(name);

        sb.append("\n\t");
        sb.append("Age: ");
        sb.append(age);

        sb.append("\n\t");
        sb.append("Weight: ");
        sb.append(weight);

        sb.append("\n\t");
        sb.append("Snacks: ");
        sb.append(snackList);

        return sb.toString();
    }
}
