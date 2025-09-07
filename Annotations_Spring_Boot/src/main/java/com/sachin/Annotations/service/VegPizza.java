package com.sachin.Annotations.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
//@Primary
public class VegPizza implements Pizza
{
    @Override
    public String getPizza()
    {
        System.out.println("Veg Pizza");
        return "Veg Pizza";
    }
}
