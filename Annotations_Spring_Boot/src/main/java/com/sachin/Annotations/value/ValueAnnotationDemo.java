package com.sachin.Annotations.value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo
{
    @Value("${java.home}")
    private String javaHome;

    //@Value("${Home}")
    //private String homeDir;

    @Value("Default Value")
    private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String secret;

    public String getJavaHome()
    {
        return javaHome;
    }

    public String getHost() {
        return host;
    }

    public String getEmail() {
        return email;
    }

    public String getSecret() {
        return secret;
    }

    public String getDefaultName()
    {
        return defaultName;
    }
}
