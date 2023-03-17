package org.example;

public class LogManager {
 public void log(int logType)
 {
     if (logType == 1)
     {
         System.out.println("db loglandı");
     } else if (logType == 2) {
         System.out.println("sms loglandı");
     } else if (logType == 3) {
         System.out.println("dosya loglandı");
     }
 }
}