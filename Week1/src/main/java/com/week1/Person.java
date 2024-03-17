package com.week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    @Autowired
    @Qualifier("Vest")
    private Outfit outfit;

    @Autowired
    private HairStyle hairStyle;

    public Person(Outfit outfit) {
        this.outfit = outfit;
    }
}
