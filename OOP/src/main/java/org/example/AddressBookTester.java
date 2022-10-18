package org.example;

public class AddressBookTester {
    public static void main(String[] args) {
        Person p1 = new Person("Christina", "Snyder", "03/31/1992", "(123)456-9321", "christina.snyder@kenzie.academy");
        Person p2 = new Person("Michael", "Meacham", "(987)654-1234");
        Person p3 = new Person("Oprah", "Winfrey", "(123)987-4321");
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
        p2.setDOB("04/30/1992");
        System.out.println(p2.getAge());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("--------");
        Address childhoodHome = new Address(3860, "Old Path Crossing", "Suwanee", "GA", "30024");
        System.out.println(childhoodHome);
        System.out.println();
        Address collegeApt = new Address(1234, "Forgotten Street", 627, "Atlanta", "GA", "30316");
        System.out.println(collegeApt);

    }


}
