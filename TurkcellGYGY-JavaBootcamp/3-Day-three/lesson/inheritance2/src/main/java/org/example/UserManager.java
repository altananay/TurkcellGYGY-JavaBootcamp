package org.example;

public class UserManager {
    public void add(Logger logger)
    {
        System.out.println("kullanıcı eklendi");
        Logger logger1 = new DatabaseLogger();
        logger1.log();
    }
}
