package org.example;

public class BookTester {
    public static void main(String[] args) {
        //How do I create objects?
        //DataType varName = new DataType();
            //that creates an object, and
            //sets all properties to their default values
        //Default Values:
            /*
            int -> 0
            double -> 0.0
            boolean -> false
            String -> null
            Objects -> null
             */
        Book firstBook = new Book();
        System.out.println(firstBook.title);
        firstBook.title = "The Color of Law";
        System.out.println(firstBook.title);
        firstBook.author = "Richard Rothstein";
        firstBook.ISBN = 123456;
        firstBook.numPagesRead = 25;

        System.out.println(firstBook.numPagesRead);
        System.out.println(firstBook.getBookInfo());

        //TODO: Make a new book, give it data, and print out info
        //The Lorax, written by Dr. Suess
        Book kidsBook = new Book();
        kidsBook.title = "The Lorax";
        kidsBook.author = "Dr. Suess";
        kidsBook.ISBN = 13579;
        kidsBook.numPagesRead = 2;
        System.out.println(kidsBook.getBookInfo());

        kidsBook.read();
        kidsBook.read();

        //I want to read 10 pages!
        for (int i = 0; i < 10; i++){
            kidsBook.read();
        }

    }
}
