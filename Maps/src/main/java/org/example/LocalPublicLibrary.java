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

        int answer = method(2);
        System.out.println(answer);

        Book first = new Book("The Lorax", "Dr. Suess", "Children", 123);
        Book second = new Book("Abraham Lincoln's Biography", "Some Dude", "Non-Fiction", 456);
        Book third = first.combine(second);
        System.out.println(third);
        Book fourth = second.combine(first);
        System.out.println(fourth.getAuthor());

        String x = "hello";
        String y = x;
        String z = new String("hello");
        System.out.println(x + y + z);
        boolean t1 = x == y;
        boolean t2 = x == z;
        boolean t3 = x.equals(z);
        boolean t4 = x.equals(x); // still true because x is itself -> reflexivity
        boolean t5 = z.equals(x); //also true -> symmetry

        boolean t6 = z.equals(y);
        boolean t7 = x.equals(y); //transitivity (if a == b, b == c, then a == c)

        //consistency-> same question, I get the same answer

        boolean t8 = x.equals(null); //-> should always return false, non-nullity

        boolean result1 = first.equals(second);
        System.out.println("Compare to second: " + result1);
        boolean result2 = first.equals(first);
        System.out.println("Compare to itself: " + result2);

        Book shallowCopy = first;
        boolean result3 = shallowCopy.equals(first);
        System.out.println("Compare to shallowCopy: " + result3);

        Book deepCopy  = new Book(first.getTitle(), first.getAuthor(), first.getGenre(), first.getISBN());
        System.out.println(first);
        System.out.println(deepCopy);
        boolean result4 = deepCopy.equals(first);
        System.out.println("Compare to deepcopy: " + result4);
        //logical equality

        boolean weird = first.equals(lib);

        boolean isBook = first instanceof Book;
        boolean isLibrary = lib instanceof Library;
        boolean alwaysTrue = first instanceof Object;

    }

    public static int method(int param){
        return param* 10;
    }
}
