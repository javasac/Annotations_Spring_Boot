package com.sachin.Annotations.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component
public class NonVegPizza implements Pizza
{
    @Override
    public String getPizza()
    {
        return "Veg Non-Pizza";
    }
}
