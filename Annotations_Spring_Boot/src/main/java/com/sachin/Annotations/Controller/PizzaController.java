package com.sachin.Annotations.Controller;
import com.sachin.Annotations.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("pizzaDemo")
public class PizzaController
{
    private Pizza pizza;

    //@Autowired
    //public PizzaController(@Qualifier("nonVegPizza") Pizza piz)
    public PizzaController(Pizza piz)
    {
        this.pizza = piz;
    }

    public String getPizza()
    {
        return pizza.getPizza();
    }

    public void init()
    {
        System.out.println("init method");
    }

    public void destroy()
    {
        System.out.println("destroy method");
    }

}
