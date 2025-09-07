package com.sachin.Annotations.service;
import org.springframework.stereotype.Service;

@Service
public class MyService
{
    public String hello()
    {
        System.out.println("Hello MyService");
        return "Hello MyService";
    }
}
