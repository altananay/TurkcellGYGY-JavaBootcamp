package org.example;

public class Main {
    public static void main(String[] args) {

        Category category = new Category(1, "programlama");
        Course course = new Course();
        Instructor instructor = new Instructor(1, "engin", "demiroğ");
        Instructor instructor1 = new Instructor(2, "burak", "kalaycı");
        Instructor[] instructors = {instructor1, instructor};
        course.setInstructor(instructors);
        course.setCategory(category);
        course.setId(1);
        course.setName("Java");
        course.print();
    }
}