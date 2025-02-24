package com.sachin.Annotations.Controller;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{
    public String hello()
    {
        return "Hello Controller";
    }
}
