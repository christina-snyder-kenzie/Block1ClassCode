package org.example;

public abstract class Property {
    protected String name;
    protected int cost;
    protected Player owner;

    public Property(String name, int cost){
        this.name = name;
        this.cost = cost;
        owner = null;
    }
}
