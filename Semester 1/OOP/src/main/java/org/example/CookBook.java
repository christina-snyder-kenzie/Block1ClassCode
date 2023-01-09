package org.example;

public class CookBook {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("Papi's Rice", 1, 25, "Heat oil, add rice, add water + salt, cook");
        r1.addIngredient(1 , "TBSP", "Vegetable Oil");
        r1.addIngredient(1, "Cup", "Rice");
        r1.addIngredient(2, "Cups", "Water");

        r1.scale(3);
        System.out.println(r1); //the println automatically calls .toString()

        //System.out.println(r1.totalTime); NO LONGER DO THIS
        System.out.println(r1.getTotalTime());
        //r1.name = "Christina's Rice"; CAN'T DO THIS EITHER
        r1.setName("Christina's Rice");
        System.out.println(r1.getName());
    }
}
