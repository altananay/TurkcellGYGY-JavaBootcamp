package org.example;

public class UserManager {
    /*public void add(Instructor instructor)
    {
        System.out.println(instructor.getFirstName() + " eklendi");
    }

    public void add(Applicant applicant)
    {
        System.out.println(applicant.getFirstName() + " eklendi");
    }*/

    public void add(User user)
    {
        System.out.println(user.getFirstName() + " eklendi");
    }

    public void addMultiple(User[] users)
    {
        for (User user: users)
        {
            add(user);
        }
    }
}