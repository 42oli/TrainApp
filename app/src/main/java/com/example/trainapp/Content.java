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
    public static ElementService elementService = new ServiceDevImpl();
    public static PersonService personService = (PersonService) elementService;
    public static final Map<String, Person> PERSON_MAP = ServiceDevImpl.PERSON_MAP;

}
