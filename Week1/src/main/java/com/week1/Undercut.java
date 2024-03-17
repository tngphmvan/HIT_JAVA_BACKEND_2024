package com.week1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Undercut implements HairStyle{

    @Override
    public void display() {
        System.out.println("Undercut");
    }
}
