package com.sachin.Annotations.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello Controller";
    }
}
