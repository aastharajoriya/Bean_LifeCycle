package com.aastha.beans;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Motor {
    @PostConstruct
    public void init(){
        System.out.println("Motor-init() method....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Motor- destroy() method...");
    }
}
