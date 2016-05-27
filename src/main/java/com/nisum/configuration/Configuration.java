package com.nisum.configuration;

import com.nisum.HelloFormatter;
import com.nisum.HelloService;
import com.nisum.StandardOutputLogger;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name = "helloFormatter")
    public HelloFormatter getFormatter(){
        HelloFormatter formatter = new HelloFormatter();
        formatter.setPreffix("XXXXXXXX-");
        return formatter;
    }
    @Bean(name = "helloFormatter")
    public HelloFormatter getFormatter1(){
        HelloFormatter formatter = new HelloFormatter();
        formatter.setPreffix("YYYYYYYY-");
        return formatter;
    }

    @Bean(name = "messageStandardOutput")
    public StandardOutputLogger getOutputLogger(){
        StandardOutputLogger outputLogger = new StandardOutputLogger();
        outputLogger.setMessage("Good Morning!!!!!");
        return outputLogger;
    }

    @Bean(name = "helloServiceGERMAN")
    public HelloService getHelloServiceGerman(){
        HelloService helloService = new HelloService();
        helloService.setFormatter(getFormatter());
        helloService.setStandardOutputLogger(getOutputLogger());
        return helloService;
    }

    @Bean(name = "helloServiceGERMANAUTOBEAN")
    public HelloService getHelloServiceAUtoBean(){
        HelloService helloService = new HelloService();
        helloService.setFormatter(getFormatter1());
        return helloService;
    }
}
