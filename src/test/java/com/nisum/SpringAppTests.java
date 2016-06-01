package com.nisum;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;


public class SpringAppTests {

    private HelloService helloServiceOriginal;
    private HelloService helloServicePirata;


    @Before
    public void setUp() throws Exception {
        System.setProperty("app-environment", "dev");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        helloServiceOriginal = (HelloService) context.getBean("helloServiceGERMAN");

        helloServicePirata = (HelloService) context.getBean("helloServiceGERMANAUTOBEAN");
    }


    @Test
    public void testSayHelloOriginal() {
        assertEquals("XXXXXXXX-Hello world!", helloServiceOriginal.sayHello());
    }


    @Test
    public void testSayHelloPirata() {
        assertEquals("YYYYYYYY-Hello world!", helloServicePirata.sayHello());
    }


    @Test
    public void testGoodMorning() throws Exception {
        helloServiceOriginal.sayGoodMorning();
    }
}
