package com.xworkz.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Wagnor {
    public Wagnor(){
        System.out.println("Wagnor Car Dtails Constructor");
    }


    String getCar(){
        String name = "Skanda";
        return name;
    }



}
