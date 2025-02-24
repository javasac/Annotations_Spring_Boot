package com.sachin.Annotations.scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Singleton is default scope.
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean
{
    public SingletonBean()
    {
        System.out.println("SingletonBean.......");
    }
}
