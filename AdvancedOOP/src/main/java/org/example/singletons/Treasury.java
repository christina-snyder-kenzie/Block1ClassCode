package org.example.singletons;

public class Treasury {
    private double moneyPrinted;

    /*
    1. Private static instance
    2. Private constructor
    3. Public static getter method (for the instance)
     */
    private static Treasury instance/* = new Treasury()*/;

    private Treasury(){
        moneyPrinted = 1000000000;
    }

    public static Treasury getInstance() {
        if (instance == null){
            instance = new Treasury();
        }
        return instance;
    }

    public void printMoney(){
        moneyPrinted ++;
    }

    public String toString(){
        return String.format("Money Printed: $%.2f", moneyPrinted);
    }
}
