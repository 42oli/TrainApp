package com.example.trainapp;

import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Gymnast extends Person {

    private final SortedSet<Element> masteredElements;
    private final SortedSet<Element> currentlyTraining;

    public Gymnast(String name, LocalDate birthDay, Sex sex) {
        this(name, birthDay, sex, new TreeSet<>(), new TreeSet<>());
    }

    public Gymnast(String name, LocalDate birthDay, Sex sex, SortedSet<Element> masteredElements, SortedSet<Element> currentlyTraining) {
        super(name, birthDay, sex);
        this.masteredElements = masteredElements;
        this.currentlyTraining = currentlyTraining;
    }

    public SortedSet<Element> getMasteredElements() {
        return masteredElements;
    }

    public SortedSet<Element> getCurrentlyTraining() {
        return currentlyTraining;
    }

    @Override
    public String getContent() {
        return "Currently training on:\n"
                + currentlyTraining.stream().map(e -> e.getElementNameEn()).collect(Collectors.joining("\n"))
                + "\nAlready mastered:\n"
                + masteredElements.stream().map(e -> e.getElementNameEn()).collect(Collectors.joining("\n"))
                + "\n\n"
                + super.getContent();
    }
}
