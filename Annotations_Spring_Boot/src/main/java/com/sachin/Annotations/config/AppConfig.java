package com.sachin.Annotations.config;
import com.sachin.Annotations.Controller.PizzaController;
import com.sachin.Annotations.service.NonVegPizza;
import com.sachin.Annotations.service.Pizza;
import com.sachin.Annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
//@Lazy
public class AppConfig
{
    //@Bean(name = "vegPizzaBean")
    @Bean
    public Pizza vegPizza()
    {
        return new VegPizza();
    }

    //@Bean(name = "nonVegPizzaBean")
    @Bean
    @Lazy
    public Pizza nonVegPizza()
    {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(nonVegPizza());
    }
}
