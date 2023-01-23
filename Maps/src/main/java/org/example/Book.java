package org.example;

public class Book {
    private String title, author, genre;
    private int ISBN;

    public Book(String t, String a, String g, int i){
        title = t;
        author = a;
        genre = g;
        ISBN = i;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }

    //GOAL: make a new book with combined data from b1 and b2
    //b1.combine(b2);
    public Book combine(Book b2){
        //where is b1?
        //is the this
        //the data from b1 is this.title, etc

        String newTitle = this.title + " & " + b2.getTitle();
        String newAuthor = /*this.*/getAuthor() + " & " + b2.getAuthor();
        String newGenre = this.genre + " & " + b2.genre;
        //private means I can only be accessed within the file where I am defined
        int newISBN = ISBN + b2.ISBN;

        Book b3 = new Book(newTitle, newAuthor, newGenre, newISBN);
        return b3;
    }

    //Overriding the .equals() method
    public boolean equals(Object other){
        //2 tests that happen first
        //reflexivity, and non-nullity
        if (other == null){
            return false;
        }

        if (this == other){ //using == ON PURPOSE
            //== compares memory addresses
            //if MY memory address is the same as OTHER's memory address
            //we are literally the same object
            return true;
        }

        //we need to make sure that other is of type Book
        //introducing: instanceof
        // variable instanceof className
        // will result in a true or false
        if ( ! (other instanceof Book)){
            return false;
        }

        //if we get here, other is a Book, but it's classified as an Object
        //When we're classified as an object, we can ONLY do things
            //objects can do

        //String otherTitle = other.getTitle();

        //type-casting changes the classification
        Book otherBook = (Book) other;

        String otherTitle = otherBook.getTitle();
        String otherAuthor = otherBook.getAuthor();
        int otherISBN = otherBook.ISBN;

        return this.title.equals(otherTitle)
                && this.author.equals(otherAuthor)
                && this.ISBN == otherISBN;

    }

}
