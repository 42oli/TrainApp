package com.example.trainapp;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Content {
    public static final List<Person> PEOPLE = new ArrayList<>();
    public static final Map<String, Person> PERSON_MAP = new HashMap<>();
    public static final Set<Element> ELEMENTS = new HashSet<>();

    // TODO: access to full list etc.
    // this is just a dummy implementation
    static {
        Element halfInFlieger = new Element("1/2 in 3/4 rw A");
        Element full = new Element("Full", new TreeSet<>(Arrays.asList(halfInFlieger)));
        Element fullFull = new Element("Full", new TreeSet<>(Arrays.asList(halfInFlieger, full)));
        ELEMENTS.addAll(Arrays.asList(halfInFlieger, full, fullFull));
        TreeSet<Element> stuffOliCan = new TreeSet<>();
        stuffOliCan.add(halfInFlieger);
        stuffOliCan.add(full);
        TreeSet<Element> stuffOliTrains = new TreeSet<>();
        stuffOliTrains.add(fullFull);
        PEOPLE.add(new Gymnast("Oli", LocalDate.of(1996, Month.SEPTEMBER.getValue(), 12), Person.Sex.MALE, stuffOliCan, stuffOliTrains));
        PEOPLE.add(new Gymnast("Silvan", LocalDate.of(2000, Month.SEPTEMBER.getValue(), 2), Person.Sex.MALE, new TreeSet<>(Arrays.asList(halfInFlieger, full, fullFull)), Collections.emptySortedSet()));
        PEOPLE.add(new Person("Andrea", LocalDate.of(1993, Month.AUGUST.getValue(), 16), Person.Sex.FEMALE)); // glaub..
        PEOPLE.forEach(p -> PERSON_MAP.put(p.getName(), p));
    }

}
