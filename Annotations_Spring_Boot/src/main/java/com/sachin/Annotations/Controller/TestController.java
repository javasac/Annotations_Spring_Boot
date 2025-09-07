package com.sachin.Annotations.Controller;
import com.sachin.Annotations.service.MyService;
import com.sachin.Annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @Autowired
    MyService myService;

    @GetMapping("/hello")
    public String hello()
    {
        myService.hello();
        return "Hello World !!";
    }

    @GetMapping("/name")
    public String name()
    {
        myService.hello();
        return "Sachin Kansal";
    }
}
