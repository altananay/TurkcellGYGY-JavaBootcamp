package org.example;

public class FileLogger extends Logger{
    @Override
    public void log()
    {
        //super.log(); -> base logger'ı çağır.
        System.out.println("dosyaya loglandı");
    }
}
