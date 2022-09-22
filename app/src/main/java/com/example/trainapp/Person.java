package com.example.trainapp;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDay;

    public Person(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getContent(){
        return "Birthday: " + getBirthDay().toString();
    }
}
