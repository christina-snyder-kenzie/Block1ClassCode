package org.example;

import java.util.ArrayList;

public class Recipe {
    //properties
        //ArrayList<Ingredient> -> AddIngredient(amt, unt, name)
            //amount
            //unit
            //name?
        //Procedure -> Steps -> Instructions
        //totalTime?
            //prep time
            //cook time
        //category
        //# Servings
        //difficulty level

    private String procedure, name;
    private int totalTime, prepTime, cookTime;
    private ArrayList<Ingredient> ingredients;

    public Recipe(String n, int prep, int cook, String proc){
        name = n;
        prepTime = prep;
        cookTime = cook;
        totalTime = prepTime + cookTime; //derived property
        procedure = proc;
        ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(int amount, String unit, String name){
        //create the ingredient
        Ingredient toAdd = new Ingredient(amount, unit, name);
        //add it to the list
        ingredients.add(toAdd);
    }

    //GOAL: update all amounts of ingredients by the factor
    public void scale(double factor){
        for (Ingredient curr : ingredients){
            double initialAmount = curr.getAmount();
            double scaledAmount = initialAmount * factor;
            //curr.amount = scaledAmount;
            curr.setAmount(scaledAmount);
        }
    }

    public String toString(){
        StringBuilder toReturn = new StringBuilder(name);
        toReturn.append("\nPrep Time: " + prepTime);
        toReturn.append("\nCook Time: " + cookTime);
        toReturn.append("\nTotal Time: " + totalTime);
        toReturn.append("\n------------------");
        //toReturn.append(ingredients);
        for (Ingredient currItem : ingredients){
            toReturn.append("\n" + currItem);
        }
        toReturn.append("\n------------------");
        toReturn.append("\nProcedure:\n" + procedure);
        return toReturn.toString();
    }

    public int getTotalTime(){
        return totalTime;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }
} //ends Recipe

class Ingredient{
    private double amount;
    private String unit, name;

    public Ingredient(double amount, String unit, String name){
        //When you have a property with the same name as a parameter
            //By Default, the name will go with the parameter
        //this -> the pronoun "I"
            //I is a self-referencing pronoun
        //the this is a self-referencing variable
            //the this references the object I am currently coding
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public String toString(){
        return amount + " " + unit + " " + name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
