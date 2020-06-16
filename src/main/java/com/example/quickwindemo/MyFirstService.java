package com.example.quickwindemo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class MyFirstService {

    public MyFirstService() {

        System.out.println( " MyFirstService Constructor called");
    }

    @EventListener(classes = ApplicationReadyEvent.class)
    public void init(){

        System.out.println("MyFirstService is ready: Application has been started");
    }

    static int counter = 0;

    public HelloDatenTransferObject helloDatenTransferObject(String user){
        counter ++;
        return new HelloDatenTransferObject(String.format("Hello %s this application " +
                "has called %s times ", user, counter));
    }
}
