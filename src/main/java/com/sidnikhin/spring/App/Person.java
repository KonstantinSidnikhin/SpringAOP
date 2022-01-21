package com.sidnikhin.spring.App;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")

public class Person {

    private Pet pet;
//    @Value("${person.age}")
    private int age;
//    @Value("${person.surname}")
    private String surname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Autowired

    Person ( @Qualifier("catBean") Pet pet){
        this.pet=pet;
    }
    public void callMyPet(){
        System.out.println("hello my loveley pet!");
        pet.voice();
    }

}
