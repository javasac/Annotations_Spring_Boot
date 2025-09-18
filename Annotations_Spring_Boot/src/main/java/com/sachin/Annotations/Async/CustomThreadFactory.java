package com.sachin.Annotations.Async;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomThreadFactory implements ThreadFactory
{
    private final AtomicInteger threadNo = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r)
    {
        Thread th = new Thread(r);
        th.setName("MyThread-" + threadNo.getAndIncrement());

        return th;
    }
}
