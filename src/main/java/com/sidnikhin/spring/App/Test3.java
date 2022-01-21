package com.sidnikhin.spring.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(myConfig.class);
        Person person=context.getBean("personBean",Person.class);
        person.callMyPet();
        context.close();
    }
}
