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

    //methods in an abstract class are concrete by default
    //so we have to specify "Abstract"
    public abstract int calcRent();

    public boolean isOwned(){
        return owner != null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
