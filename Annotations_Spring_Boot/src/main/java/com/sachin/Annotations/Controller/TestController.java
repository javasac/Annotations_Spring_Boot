package com.sachin.Annotations.Controller;
import com.sachin.Annotations.Async.AsyncTest;
import com.sachin.Annotations.service.MyService;
import com.sachin.Annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @Autowired
    MyService myService;

    @Autowired
    AsyncTest asyncTest;

    @GetMapping("/async")
    public String testAsync()
    {
        System.out.println("=====TestController-->testAsync()=====" + Thread.currentThread().getName());
        asyncTest.AsyncTest();
        //AsyncTest();
        return "Async method";
    }

    /*@Async("SK-ThreadPool")
    public void AsyncTest()
    {
        System.out.println("=====AsyncTest class--->AsyncTest() method=====" + Thread.currentThread().getName());

        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }*/

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
