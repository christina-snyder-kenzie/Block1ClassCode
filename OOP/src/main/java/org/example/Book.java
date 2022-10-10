package org.example;

public class Book {
    //properties (Instance Variables)
    //acccessModifier dataType name;

    public String title;
    public String author;
    public int ISBN;
    public int numPagesRead;


    public String getBookInfo(){
        //GOAL: to make a sentence:
            //The book <title> was written by <author>.
        StringBuilder toReturn = new StringBuilder("The book ");
        toReturn.append(title);
        toReturn.append(" was written by ");
        toReturn.append(author);
        toReturn.append(".");
        return toReturn.toString();
    }

    //GOAL: read a page of the book
        //also print out a sentence: "turning from page x to page y"
    public void read(){
        System.out.println("Turning from page " + numPagesRead + " to page " + (numPagesRead + 1));
        numPagesRead++;
    }

}
