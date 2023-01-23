package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private HashMap<Integer, Book> inventory;

    public Library(){
        inventory = new HashMap<>();
    }

    public void add(Book b){
        int ISBN = b.getISBN();
        inventory.put(ISBN, b);
    }

    //checkStock
    // return a boolean if the library has the book or not

    //Efficiency: O(1)
    public boolean checkStock(int ISBN){
        //V value = map.get(key);
        Book b = inventory.get(ISBN);
        //option 1 -> we get the right book
        //option 2 -> we get null
        if (b == null){
            return false;
        } else {
            return true;
        }

        // return b != null;
    }

    //Efficiency: O(n)
    public boolean checkStock(String title){
        //I like to loop over keys.
        //Does the value, associated with the current key, contain the target title?
        for (int ISBN : inventory.keySet()){
            Book b = inventory.get(ISBN);
            if (b != null){
                if (b.getTitle().equals(title)){
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        //Each book on its own line:
        //ISBN1: {book toString 1}
        //ISBN2: {book toString 2}

        StringBuilder sb = new StringBuilder();
        for (HashMap.Entry<Integer, Book> entry : inventory.entrySet()){
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }


    public HashMap<Integer, Book> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<Integer, Book> inventory) {
        this.inventory = inventory;
    }

    //GOAL: grab all books of a particular genre
    //Key: isbn, value: book

    //make a bucket (probably an arraylist?)
    //loop over all the keys
        //grab the book
        //test the book for the genre
            //toss it in the bucket
    //our bucket will be full of books

    public ArrayList<Book> grabGenre(String genre){
        ArrayList<Book> bucket = new ArrayList<Book>();
        for (int isbn : inventory.keySet()){
            //V value = map.get(key);
            Book b = inventory.get(isbn);
            String g = b.getGenre();
            if (b.getGenre().equals(genre)){
                bucket.add(b);
            }
        }
        return bucket;
    }







}
