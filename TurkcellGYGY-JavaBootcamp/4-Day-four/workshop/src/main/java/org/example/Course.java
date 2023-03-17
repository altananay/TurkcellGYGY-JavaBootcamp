package org.example;

public class Course {
    private int id;
    private String name;
    private Instructor[] instructor;
    private Category category;

    public Course() {
    }

    public Course(int id, String name, Instructor[] instructor, Category category) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor[] getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor[] instructor) {
        this.instructor = instructor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void print()
    {
        System.out.println("Id: " + this.id + " " + this.category.getName());
        for (Instructor instructor1: instructor)
        {
            System.out.println("Eğitmenler: " + instructor1.firstName + " " + instructor1.lastName);
        }
        System.out.println("Kategori: " + this.name);
    }
}
