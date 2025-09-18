package com.sachin.Annotations.Async;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;

@Configuration
public class AppConfigThread
{
    @Bean(name="SK-ThreadPool")
    public Executor taskPoolExecutor()
    {
        System.out.println("=====AppConfigThread--->taskPoolExecutor()=====");

        ThreadPoolTaskExecutor tpt = new ThreadPoolTaskExecutor();
        tpt.setCorePoolSize(2);
        tpt.setMaxPoolSize(7);
        tpt.setQueueCapacity(3);
        tpt.setThreadNamePrefix("SK-");
        tpt.initialize();

        //ThreadPoolExecutor tpt = new ThreadPoolExecutor(2, 7, 1, TimeUnit.HOURS, new ArrayBlockingQueue<>(3), new CustomThreadFactory());
        //System.out.println("=====AppConfigThread--->taskPoolExecutor()=====" + tpt.getCorePoolSize());

        return tpt;
    }
}
