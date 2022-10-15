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
    // TODO: access to full list etc.
    // this is just a dummy implementation
    public ElementService elementService;
    public PersonService personService;
    public Map<String, Person> PERSON_MAP;

    public Content() {
        ServiceDevImpl service = new ServiceDevImpl();
        elementService = service;
        personService = (PersonService) elementService;
        PERSON_MAP = service.PERSON_MAP;
    }
}
