package org.example;

public class Consortium {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        System.out.println(b1);
        System.out.println("W/D 1: " + b1.withdraw(700));
        System.out.println(b1);
        System.out.println("W/D 2: " + b1.withdraw(700));
        System.out.println(b1);


        SavingsAccount s1 = new SavingsAccount(300, 0.035);
        s1.deposit(2000);
        System.out.println(s1);
        for (int i = 0; i < 10; i++) {
            double interest = s1.earnInterest();
            System.out.println(interest);
            System.out.println(s1);
        }
        //how many years until I reach $10,000?
        int years = 10;
        while (s1.checkBalance() < 10000){
            s1.earnInterest();
            years++;
        }
        System.out.println("It takes " + years + " years");

        System.out.println("-----------");
        CheckingAccount c1 = new CheckingAccount();
        c1.deposit(500);
        System.out.println(c1);
        /*//can I withdraw 10 dollars 5 times?
        for (int i = 0; i < 5; i++){
            System.out.println(c1.withdraw(10));
            System.out.println(c1);
        }
        //what do I expect to see?
         */

        //Can I withdraw $200 5 times?
        //What do I expect to see?
       /* for (int i = 0; i < 5; i++){
            System.out.println(c1.withdraw(200));
            System.out.println(c1);
        }*/

        //Can I withdraw $10 10 times?
        for (int i = 0; i < 10; i++){
            System.out.println(c1.withdraw(10));
            System.out.println(c1);
        }
        //what do we expect to see?

        //can I withdraw 5 2 times
        //try to withdraw 5000 5 times
        //can i withdraw 5 3 more times?
        //yes i can

        //edge cases-> not obvious, but still need to be accounted for

    }
}
