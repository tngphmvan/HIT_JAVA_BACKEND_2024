package com.week1;

import org.springframework.stereotype.Component;

@Component
public class Vest implements Outfit{


    @Override
    public void display() {
        System.out.println("Vest");
    }
}
