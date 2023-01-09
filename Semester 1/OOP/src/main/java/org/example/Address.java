package org.example;

public class Address {
    private int houseNum, unitNum;
    private String street, city, state, zip;

    public Address(int houseNum, String street, int unitNum, String city, String state, String zip){
        this.houseNum = houseNum;
        this.street = street;
        this.unitNum = unitNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(int houseNum, String street, String city, String state, String zip){
        this(houseNum, street, -1, city, state, zip);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(houseNum).append(" ").append(street);
        if (unitNum != -1){
            sb.append(", Unit ").append(unitNum);
        }
        sb.append("\n").append(city).append(", ").append(state);
        sb.append(" ").append(zip);
        return sb.toString();
    }


}
