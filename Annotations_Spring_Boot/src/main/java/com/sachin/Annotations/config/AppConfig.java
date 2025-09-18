package com.sachin.Annotations.config;
import com.sachin.Annotations.Controller.PizzaController;
import com.sachin.Annotations.Interceptor.MyCustomInterceptor;
import com.sachin.Annotations.service.NonVegPizza;
import com.sachin.Annotations.service.Pizza;
import com.sachin.Annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@Lazy
public class AppConfig implements WebMvcConfigurer
{
    @Autowired
    MyCustomInterceptor myCustomInterceptor;

    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(myCustomInterceptor)
                .addPathPatterns("/async")
                .excludePathPatterns("/api/*");
    }

    /*//@Bean(name = "vegPizzaBean")
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
    }*/
}
