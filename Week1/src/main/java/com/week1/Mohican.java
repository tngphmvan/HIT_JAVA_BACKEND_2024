package com.week1;

import org.springframework.stereotype.Component;

@Component
public class Mohican implements HairStyle{
    @Override
    public void display() {
        System.out.println("Mohican");
    }
}
