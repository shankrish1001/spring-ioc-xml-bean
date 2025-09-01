package com.shankrish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class MainApp {

    private static final Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        logger.info("Main - Begin");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("message1Printer", MessagePrinter.class).printMessage();
        context.getBean("message2Printer", MessagePrinter.class).printMessage();

        logger.info("Main - End");

    }

}