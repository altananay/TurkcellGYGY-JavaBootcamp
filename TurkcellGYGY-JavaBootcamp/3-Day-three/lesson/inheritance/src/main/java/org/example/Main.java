package org.example;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "engin", "demiroğ", "kodlamaio");
        UserManager userManager = new UserManager();
        userManager.add(instructor);
        userManager.add(new Applicant(2, "altan", "anay", "213"));
        userManager.addMultiple(new User[]{instructor});
    }
}