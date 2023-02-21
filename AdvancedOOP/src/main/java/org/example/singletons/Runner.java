package org.example.singletons;

public class Runner {
    public static void main(String[] args) {
        //Wrong way:
        //Treasury t = new Treasury();

        //Right way:
        Treasury t = Treasury.getInstance();
        t.printMoney();
        t.printMoney();
        System.out.println(t);

        Treasury another = Treasury.getInstance();
        another.printMoney();
        System.out.println(t);

    }
}
