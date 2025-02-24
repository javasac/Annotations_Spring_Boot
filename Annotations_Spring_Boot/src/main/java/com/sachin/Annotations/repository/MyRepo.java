package com.sachin.Annotations.repository;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepo
{
    public String hello()
    {
        return "Hello Repository";
    }
}
