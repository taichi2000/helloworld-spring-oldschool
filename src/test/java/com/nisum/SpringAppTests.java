package com.nisum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class SpringAppTests {

    private HelloService helloServiceOriginal;
    private HelloService helloServicePirata;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        helloServiceOriginal = (HelloService) context.getBean("helloServiceGERMAN");
        helloServicePirata = (HelloService) context.getBean("helloServiceGERMANAUTOBEAN");

        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStream() {
        System.setOut(null);
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
        assertThat("Good Morning!!!!!", is(equalTo(outContent.toString().substring(0,outContent.size()-1))));
    }
}
