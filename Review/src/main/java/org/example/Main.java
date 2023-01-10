package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "bigboi";
        int age = 12;
        double weight = 123.4;
        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("ham");
        snacks.add("treats");

        Dog d1 = new Dog(name, age, weight, snacks);
        System.out.println(d1);
        System.out.println(d1.getID());
    }
}