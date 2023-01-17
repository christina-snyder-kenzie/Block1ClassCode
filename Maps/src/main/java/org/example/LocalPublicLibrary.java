package org.example;

public class LocalPublicLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("Stamped from the Beginning", "Ibram Kendi", "Anti-Racist", 123456);
        Book b2 = new Book("The Color of Law", "Richard Rothstein", "Anti-Racist", 987654);
        Book b3 = new Book("How to be an AntiRacist", "Ibram Kendi", "Anti-Racist", 321654);
        Book b4 = new Book("Android Programming", "Big Nerd Ranch", "Non-Fiction", 852258);
        Book b5 = new Book("Fair Play", "Eve Rodsky", "Non-Fiction", 753182);

        System.out.println(b5);
        System.out.println(b5.getGenre());

        Library lib = new Library();
        lib.add(b1);
        lib.add(b2);
        lib.add(b3);
        lib.add(b4);
        lib.add(b5);
        System.out.println(lib);

        System.out.println(lib.checkStock(123456));
        System.out.println(lib.checkStock(9999999));


    }
}
