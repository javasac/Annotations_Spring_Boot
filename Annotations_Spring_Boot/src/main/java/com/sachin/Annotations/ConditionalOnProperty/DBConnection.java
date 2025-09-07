package com.sachin.Annotations.ConditionalOnProperty;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Objects;

@Component
public class DBConnection
{
    @Autowired(required = false)
    MySQLConnection mySQLConnection;

    @Autowired(required=false)
    NoSQLConnection noSQLConnection;

    @PostConstruct
    public void init()
    {
        System.out.println("DB Connection class");
        System.out.println("MySQL Connection " + Objects.isNull(mySQLConnection));
        System.out.println("NoSQL Connection " + Objects.isNull(noSQLConnection));
    }
}
