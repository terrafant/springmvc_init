package com.uay;

import com.uay.components.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author audovychenko
 * @since 21.04.14
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        SomeService someService = context.getBean(SomeService.class);
        System.out.println( "Hello World!" + someService.getSomeSum() );
    }
}
