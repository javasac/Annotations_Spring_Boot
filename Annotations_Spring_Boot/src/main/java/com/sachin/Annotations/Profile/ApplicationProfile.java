package com.sachin.Annotations.Profile;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProfile
{
    @Value("${username}")
    String user;

    @Value("${password}")
    String password;

    @PostConstruct
    public void init()
    {
        System.out.println("================Init() method================");
        System.out.println("User Name = " + user + " and Password = " + password);
    }
}
