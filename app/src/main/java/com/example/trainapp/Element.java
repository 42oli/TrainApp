package com.example.trainapp;

import java.util.SortedSet;
import java.util.TreeSet;

public class Element implements Comparable<Element> {

    private final String name;
    private final SortedSet<Element> buildsOn;

    public Element(final String name) {
        this(name, new TreeSet<>());
    }

    public Element(final String name, final SortedSet<Element> buildsOn) {
        this.name = name;
        this.buildsOn = buildsOn;
    }

    public String getName() {
        return name;
    }

    public SortedSet<Element> getBuildsOn() {
        return buildsOn;
    }

    @Override
    public int compareTo(Element element) {
        return name.compareTo(element.name);
    }
}
