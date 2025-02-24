package com.sachin.Annotations.propertysource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:messages.properties")
})
@ComponentScan("com.sachin.Annotations")
public class PropertySourceDemo
{
    @Autowired
    private Environment env;

    //@Value("${gmail.host:0}")
    private String host;

    //@Value("${gmail.email:0}")
    private String email;

    //@Value("${gmail.password:0}")
    private String password;

    //@Value("${app.name}")
    private String appName;

    public String getAppName() {
        //return appName;
        return env.getProperty("app.name");
    }

    public String getAppDesc() {
        //return appDesc;
        return env.getProperty("app.desc");
    }

    //@Value("${app.desc}")
    private String appDesc;

    public String getHost() {
        //return host;
        return env.getProperty("gmail.host");
    }

    public String getEmail() {
        //return email;
        return env.getProperty("gmail.email");
    }

    public String getPassword() {
        //return password;
        return env.getProperty("gmail.password");
    }
}
