package com.xworkz.car.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.car")
public class carConfiguration {
    public carConfiguration(){
        System.out.println("car Configuration Constructor...");
    }

    @Bean
    String getCar(){
        String name="Wagnor";
        System.out.println("Car Get Name: "+name);
        return "name";
    }

    @Bean
    Integer numCar(){
        int number = 25;
        System.out.println("Number Is: "+number);
        return number;
    }


}
