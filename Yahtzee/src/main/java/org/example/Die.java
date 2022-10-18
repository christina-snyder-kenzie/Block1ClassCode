package org.example;

public class Die {
    private int number;
    private boolean keep;

    public Die(){
        roll();
        keep = false;
    }

    public void roll(){
        number = (int) (Math.random() * 6 + 1);
    }

    public int getValue(){
        return number;
    }

    public boolean isKept(){
        return keep;
    }

    public void keep(){
        keep = true;
    }
}
