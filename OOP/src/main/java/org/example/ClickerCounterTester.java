package org.example;

public class ClickerCounterTester {
    public static void main(String[] args) {
        //make 5 clicker counters:
            //no parameters
            //one with only dispSize too big
            //one with only dispSize right size
            //one with both, dispSize too big
            //one with both, dispSize right size
        ClickerCounter c1 = new ClickerCounter();
        ClickerCounter c2 = new ClickerCounter(15);
        ClickerCounter c3 = new ClickerCounter(7);
        ClickerCounter c4 = new ClickerCounter(15, 500);
        ClickerCounter c5 = new ClickerCounter(7, 500);

        //GOAL: is to see the counter and display value for each clicker
        ClickerCounter[] clickers = {c1, c2, c3, c4, c5};
        for (int i = 0; i < clickers.length; i++){
            System.out.println("c" + (i + 1) + "'s counter: " + clickers[i].getCounter());
            System.out.println("c" + (i + 1) + "'s counter: " + clickers[i].formatCounter());
            System.out.println("c" + (i + 1) + "'s displaySize: " + clickers[i].getDisplaySize());

            clickers[i].reset();
            System.out.println("c" + (i + 1) + "'s counter: " + clickers[i].getCounter());
            System.out.println("c" + (i + 1) + "'s counter: " + clickers[i].formatCounter());
            System.out.println("c" + (i + 1) + "'s displaySize: " + clickers[i].getDisplaySize());

        }

        System.out.println("-----Begin Clicking Testing-----");
        ClickerCounter testClick = new ClickerCounter(3);
        for (int i = 0; i < 5000; i++){
            testClick.click();
            System.out.println(testClick.formatCounter());
        }



    }
}
