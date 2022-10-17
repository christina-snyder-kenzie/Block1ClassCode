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
}
