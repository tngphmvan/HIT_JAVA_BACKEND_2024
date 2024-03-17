/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 *
 * @author 84393
 */
@Component
public class Person {

    private HairStyle hairStyle;

    private Outfit outfit;


    public Person() {
    }
    public void display(){
        hairStyle.display();
        outfit.display();
    }

}
