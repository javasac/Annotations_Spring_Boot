package com.sachin.Annotations.AOP;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{
    //@Before("within(com.sachin.Annotations.Controller..*)")
    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeMethod()
    {
        System.out.println("Inside beforeMethod() Aspect");
    }

    //@After("within(com.sachin.Annotations.Controller.TestController)")
    //@After("within(org.springframework.stereotype.Service)")
    @After("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void afterMethod()
    {
        System.out.println("Inside afterMethod() Aspect");
    }

    /**@Before("execution(public String com.sachin.Annotations.Controller.TestController.*())")
    public void beforeMethod()
    {
        System.out.println("Inside beforeMethod() Aspect");
    }

    @Before("execution(String com.sachin.Annotations..*())")
    public void afterMethod()
    {
        System.out.println("Inside afterMethod() Aspect");
    }*/
}
