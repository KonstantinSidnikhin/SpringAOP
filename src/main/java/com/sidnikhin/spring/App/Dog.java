package com.sidnikhin.spring.App;

import org.springframework.stereotype.Component;

@Component ("dogBean")
public class Dog implements Pet{
    @Override
    public void voice() {
        System.out.println("Bow-wow!");
    }
}
