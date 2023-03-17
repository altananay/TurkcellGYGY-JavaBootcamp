package org.example;

public class Employee extends User{

    private double salary;
    public Employee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }


}
