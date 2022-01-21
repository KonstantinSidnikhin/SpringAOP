package com.sidnikhin.spring.App;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson",Person.class);
        person.callMyPet();
        context.close();
    }
}
