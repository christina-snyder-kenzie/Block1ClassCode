package org.example;

public class Person {
    private String firstName, lastName, DOB, phoneNumber, email;

    public Person(String firstName, String lastName, String DOB, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        DOB = "unknown";
        email = "unknown";
    }

    //CAN I write a constructor that only takes in first last email? (NO)
    public Person(String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = "unknown";
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //we need getters and setters
    //I want to write a getAge() method -> the age you turn in 2022
        //age = 2022 - birthYear
    public int getAge(){
        if (DOB.equals("unknown")){
            System.out.println("We do not know " + firstName +"'s birthdate");
            return -1;
        }
        String[] dates = DOB.split("/");
        int birthYear = Integer.parseInt(dates[2]);
        return 2022 - birthYear;
    }

    public void setDOB(String newDOB){
        DOB = newDOB;
    }

    //GOAL: WRite a toString() that prints out a person in the following format:
    //Christina Snyder
    //Phone Number: (123)456-9321
    //Email: christina.snyder@kenzie.academy
    //DOB: 03/31/1992

    //If a property is unknown, leave it out
    //Michael Meacham
    //Phone Number: (123)456-9321
    //DOB: 04/30/1992

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName);
        sb.append("\nPhone Number: ").append(phoneNumber);
        if (email.equals("unknown")){
            //ignore it
        } else {
            //use it
            sb.append("\nEmail: ").append(email);
        }

        if (!DOB.equals("unknown")){
            //use it
            sb.append("\nDOB: ").append(DOB);
        }
        return sb.toString();
    }

}
