/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/**
 *
 * @author 84393
 */
@Component
@Primary
public class Undercut implements HairStyle{

    @Override
    public void display() {
        System.out.println("Undercut");
    }
    
}
