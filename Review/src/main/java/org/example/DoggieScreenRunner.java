package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class DoggieScreenRunner {
    public static void main(String[] args) {
        DoggieDayCare dayCare = new DoggieDayCare();
        Scanner scan = new Scanner(System.in);
        //keepGoing boolean
        boolean keepGoing = true;
        while (keepGoing) {
            //display
            displayMenu();
            //grab response
            String response = scan.nextLine();
            //test it- 1, 2, or 3
            //if its not 1, 2 or 3, then keepGoing = false
            /*
            if (response is 1)
                check-in
            else if (resposne is 2)
                check-out
            else if (response is 3)
                list display
            else
                keepGoing = false
                */
            if (response.equals("1")){
                System.out.println("CHECKING IN");
                System.out.print("Enter your dog's name: ");
                String name = scan.nextLine();

                System.out.print("How old is " + name + "? ");
                int age = Integer.parseInt(scan.nextLine());

                System.out.print("How much does " + name + " weigh? ");
                double weight = Double.parseDouble(scan.nextLine());

                ArrayList<String> snackList = new ArrayList<String>();
                //give a prompt
                System.out.println("Enter snacks on their own line\nEnter a blank line to quit");
                //immediately grab a response
                String snack = scan.nextLine();
                //while (response is not empty)
                while (snack.length() > 0) {
                    //add the snack to the list
                    snackList.add(snack);
                    //grab a new response
                    snack = scan.nextLine();
                }

                int ID = dayCare.checkIn(name, age, weight, snackList);
                System.out.println("When you check-out your dog, you'll need this ID: " + ID);

            } else if (response.equals("2")){
                System.out.println("CHECKING OUT!");
                System.out.print("What is your dog's name? ");
                String name = scan.nextLine();
                System.out.print("What is the ID we gave you? ");
                int ID = Integer.parseInt(scan.nextLine());

                Dog toTest = dayCare.checkOut(name, ID);
                if (toTest == null){
                    System.out.println("Sorry, we don't have that dog...");
                } else{
                    System.out.println(toTest);
                }
            } else if (response.equals("3")){
                //System.out.println("HERE are the DOGS!");
                System.out.println(dayCare);
            } else {
                keepGoing = false;
            }

        }
        //exit message - thanks for supporting our small business
        System.out.println("~~Thank you for supporting our small business~~");
    }

    public static void displayMenu(){
        System.out.println("Choose an option or hit any other key to quit");
        System.out.println("\t1. Check-In");
        System.out.println("\t2. Check-Out");
        System.out.println("\t3. View all dogs in the day care");
    }
}
