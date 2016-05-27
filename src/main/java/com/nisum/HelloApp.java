package com.nisum;

import com.nisum.configuration.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        /*Descomentar esta linea para que se apliquen las configuraciones de la clase Configuracion*/
        //ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);



        HelloService helloService = context.getBean("helloServiceGERMAN",HelloService.class);
        System.out.println(helloService.sayHello());
    }
}
