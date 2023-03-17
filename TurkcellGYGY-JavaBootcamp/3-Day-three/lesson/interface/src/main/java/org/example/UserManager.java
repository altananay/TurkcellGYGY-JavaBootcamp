package org.example;

public class UserManager{

    private Logger logger;

    public UserManager(Logger logger)
    {
        this.logger = logger;
    }

    public void add()
    {
        System.out.println("kullanıcı eklendi.");
        logger.log("kullanıcıya");
        //tightly coupled.
        /*EmailLogger logger = new EmailLogger();
        logger.log("kullanıcıya email gönderildi.");*/
    }
}