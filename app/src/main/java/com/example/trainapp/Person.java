package com.example.trainapp;

import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private final String name;
    private final LocalDate birthDay;
    private final Sex sex;

    public Person(String name, LocalDate birthDay, Sex sex) {
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
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

    public Sex getSex() { return sex; }
}
