package org.example;

public class Employee {
    private double salary;
    private String department;

    public Employee(double s, String d){
        salary = s;
        department = d;
    }

    public void clockIn(){
        System.out.println("I'm here!");
    }
}

class Manager extends Employee {
    //in the constuctor of any subclass, you must call super
    private String[] duties;

    public Manager(double salary, String dept, String[] duties){
        super(salary * 1.1, "Management-" + dept);
        this.duties = duties;
    }

    public void clockIn(){
        super.clockIn();
        System.out.println("Do opening duties");
    }

}