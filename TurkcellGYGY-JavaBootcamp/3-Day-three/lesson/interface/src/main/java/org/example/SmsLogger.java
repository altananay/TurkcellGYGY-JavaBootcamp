package org.example;

public class SmsLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message + " sms loglandı.");
    }
}
