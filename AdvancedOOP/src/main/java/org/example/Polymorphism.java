package org.example;

public class Polymorphism {
    public static void main(String[] args) {
        BankAccount rich = new BankAccount(1000000);
        System.out.println(rich);

        SavingsAccount savings = new SavingsAccount(7000, 0.02);
        savings.earnInterest();
        System.out.println(savings);

        System.out.println(rich instanceof BankAccount);
        System.out.println(savings instanceof SavingsAccount);

        System.out.println(savings instanceof BankAccount);

        System.out.println(rich instanceof Object);
        System.out.println(savings instanceof Object);

        //is-a

        BankAccount dude = new SavingsAccount(100, 0.05);
        System.out.println(dude.checkBalance());
        dude.deposit(2500);
        System.out.println(dude.checkBalance());

        //dude.earnInterest(); Dude is wearing a bankaccount jacket

        System.out.println(dude);
        //When I can Do a more specific thing, I do the more specific thing

        for (int i = 0; i < 20; i++){
            dude.withdraw(5);
        }

        System.out.println(dude);

        BankAccount account = new CheckingAccount(1000000, 5);

        for (int i = 0; i < 20; i++){
            account.withdraw(5); //execute CheckingAccount's withdraw method
        }

        //SuperClass = new subClass

        // NOT OKAY - SavingsAccount test = new BankAccount(50);

        BankAccount b1 = new BankAccount(20);
        BankAccount b2 = new BankAccount(50);
        b1.transfer(b2, 10);
        //b1's balance? -> 10
        //b2's balance? -> 60

        SavingsAccount s1 = new SavingsAccount(20, .1);
        SavingsAccount s2 = new SavingsAccount(50, .1);
        s1.transfer(s2, 10);

        b1.transfer(s2, 10);














    }
}
