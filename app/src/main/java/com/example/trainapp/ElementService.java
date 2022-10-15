package com.example.trainapp;

import java.util.Collection;
import java.util.List;

public interface ElementService {

    List<Element> getAllElements();
    void createElement(Element e);
    void updateElement(Element e);
    void deleteElement(Element e);

}
