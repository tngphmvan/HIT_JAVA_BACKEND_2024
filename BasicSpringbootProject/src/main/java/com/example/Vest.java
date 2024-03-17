/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.springframework.stereotype.Component;

/**
 *
 * @author 84393
 */
@Component
public class Vest implements Outfit {

    @Override
    public void display() {
        System.out.println("Vest");
    }
    
}
