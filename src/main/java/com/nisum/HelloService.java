package com.nisum;


public class HelloService {

    private HelloFormatter formatter;
    private StandardOutputLogger standardOutputLogger;

    public String sayHello() {
        return formatter.addPreffix("Hello world!");
    }

    public void setFormatter(HelloFormatter formatter) {
        this.formatter = formatter;
    }

    public void setStandardOutputLogger(StandardOutputLogger standardOutputLogger) {
        this.standardOutputLogger = standardOutputLogger;
    }

    public void sayGoodMorning() {
        standardOutputLogger.sayGoodMorning();
    }
}
