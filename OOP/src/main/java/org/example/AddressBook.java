package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Entry> entries;

    public AddressBook(){
        entries = new ArrayList<Entry>();
    }

    //create 3 add methods
        //one takes in an existing Entry
        public void add(Entry existing){
            entries.add(existing);
        }
        //one takes in a Person and Connection
        public void add(Person p, String c){
            entries.add(new Entry(p, c));
        }
        //one takes in a Person, Address, and Connection
        public void add(Person p, Address a, String c){
            entries.add(new Entry(p, a, c));
        }

        public boolean add(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first name of your contact: ");
            String firstName = scan.nextLine();

            if (firstName.isEmpty()){
                return false;
            }
            System.out.print("Enter the last name of your contact: ");
            String lastName = scan.nextLine();
            System.out.print("Enter " + firstName + "'s phone number: ");
            String phoneNumber = scan.nextLine();

            //DOB and Email -> optional
            System.out.print("Would you like to enter DOB? (Type: Y/N)");
            String DOBResponse = scan.nextLine();
            String DOB = null;
            if (DOBResponse.equalsIgnoreCase("Y")){
                System.out.print("Enter the DOB: ");
                DOB = scan.nextLine(); //update
            }

            System.out.print("Would you like to enter an email? (Type : Y/N)");
            String emailResponse = scan.nextLine();
            String email = null;
            if (emailResponse.equalsIgnoreCase("Y")){
                System.out.print("Enter the email: ");
                email = scan.nextLine();
            }

            //Make the person
            //ALL properties -> how do I know if I have all the data??
            Person p;
            if (DOB != null && email != null){
                //that means I have a DOB and an email
                p = new Person(firstName, lastName, DOB, phoneNumber, email);
            } else if (DOB == null && email != null){
                p = new Person(firstName, lastName, phoneNumber, email);
            } else {
                p = new Person(firstName, lastName, phoneNumber);
            }
            //ALL Minus DOB
            //ALL Minus DOB and Email
            System.out.print("Do you have an address to enter? (Type Y/N)");
            String addyAnswer = scan.nextLine();
            Address addy = null;
            if (addyAnswer.equalsIgnoreCase("Y")){
                //update the address
                System.out.print("Enter the house number: ");
                int houseNum = Integer.parseInt(scan.nextLine());
                System.out.print("Street: " );
                String street = scan.nextLine();
                System.out.print("Does " + firstName + " have a unit number? (Type Y/N)");
                String unitAnswer = scan.nextLine();
                int unitNumber = -1;
                if (unitAnswer.equalsIgnoreCase("Y")){
                    System.out.print("Unit Number: ");
                    unitNumber = Integer.parseInt(scan.nextLine());
                }
                //city, state, and zip
                System.out.println("Enter city, state, zip all on their own line");
                String city = scan.nextLine();
                String state = scan.nextLine();
                String zip = scan.nextLine();

                if (unitNumber != -1)
                    addy = new Address(houseNum, street, unitNumber, city, state, zip);
                else
                    addy = new Address(houseNum, street, city, state, zip);
            }
            System.out.print("How do you know this person? What is your connection?");
            String connection = scan.nextLine();

            if (addy == null){
                Entry toAdd = new Entry(p, connection);
                entries.add(toAdd);
            } else {
                entries.add(new Entry(p, addy, connection));
            }
            return true;
        }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Entry e : entries){
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }

}


class Entry{
    private Person human;
    private Address location;
    private String connection;

    public Entry(Person human, String connection){
        this.human = human;
        this.connection = connection;
        location = null;
    }

    public Entry(Person human, Address location, String connection){
        this.human = human;
        this.location = location;
        this.connection = connection;
    }

    /*
    **************
    Christina Snyder (Teacher)
    Phone Number: (123)456-9321
    Email: christina.snyder@kenzie.academy
    DOB: 03/31/1992
    -------
    3860 Old Path Crossing
    Suwanee, GA 30024
    ***************
    ***************
    Michael Meacham (Facilitator)
    Phone Number: (987)654-1234
    DOB: 04/30/1992
    **************
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(human.toString());
        int index = sb.indexOf("\n");
        sb.insert(index, " (" + connection + ")");
        sb.insert(0, "***********\n");
        if (location != null){
            sb.append("\n-------\n");
            sb.append(location.toString());
        }
        sb.append("\n***********");
        return sb.toString();
    }


}