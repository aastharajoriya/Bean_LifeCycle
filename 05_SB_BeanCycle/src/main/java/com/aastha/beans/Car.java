package com.aastha.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean, DisposableBean {


    public void drive(){
        System.out.println("I am driving a car....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car starting....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Car stop");
    }
}
