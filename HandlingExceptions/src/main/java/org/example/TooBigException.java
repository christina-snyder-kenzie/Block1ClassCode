package org.example;

public class TooBigException extends RuntimeException {
    //what should our message be?
    //The string <whatever> is too long!
    public TooBigException(String inQuestion){
        //we're gonna super up the message...
        super("The string " + inQuestion + " is too big!");
    }

    public TooBigException(int numberInQuestion){
        super("The number " + numberInQuestion + " is too big!");
    }
}
