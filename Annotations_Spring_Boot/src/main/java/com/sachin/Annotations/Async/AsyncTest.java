package com.sachin.Annotations.Async;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTest
{
    @Async("SK-ThreadPool")
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
    }
}
