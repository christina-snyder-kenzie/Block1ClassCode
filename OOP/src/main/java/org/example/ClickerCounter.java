package org.example;

public class ClickerCounter {
    //properties
    private int counter, displaySize;

    //constuctor(s)
    //job: is to initialize properties
        //how do I initialize?
            //two options:
                //-data from the user (through parameters)
                //-we can set it ourselves, as coders
    //3 constructors
        //1. Will have 2 parameters, one for dispSize, one for counter
    public ClickerCounter(int displaySize, int counter){
        this.displaySize = displaySize;
        this.counter = counter;
        //we want to CAP displaySize at 9
        if (this.displaySize > 9){
            this.displaySize = 9;
        }
    }
        //2. Will have 1 parameter, dispSize, and we'll set counter to 0
    public ClickerCounter(int displaySize){
        this.counter = 0;
        this.displaySize = displaySize;
        if (this.displaySize > 9){
            this.displaySize = 9;
        }
        //Advanced java: Ternary Operator
        //this.displaySize = (displaySize > 9) ? 9 : displaySize;
    }
        //3. No parameters. Will set counter to 0, dispSize to 5
    public ClickerCounter(){
        counter = 0;
        displaySize = 5;
    }

    //behaviors
    //getter methods
    public int getCounter(){
        return counter;
    }

    public int getDisplaySize(){
        return displaySize;
    }

    public void click(){
        counter++;
        //how do I know if I need to wraparound?
            //lets say: display size is 3.
            //999 is okay
            //1000 -> should wrap around to zero
        //what is 10 ^ 3? is that 1000?

        //what if disp size was 5?
            //what is 10^5 -> 100000
        double wrapCutOff = Math.pow(10, displaySize);
        if (counter >= wrapCutOff){
            counter = 0;
        }
    }

    public String formatCounter(){
        return String.format("%0" + displaySize + "d", counter);
    }

    public void reset() {
        counter = 0;
    }
}
