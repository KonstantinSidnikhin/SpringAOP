package com.sidnikhin.spring.App;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void voice() {
        System.out.println("mew-mew!");
    }
}
