package com.ojas.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDetails {
    private String name;
    private int age;
    @Autowired
    MyDetails(String name, int age){
        this.age=age;
        this.name=name;
    }
    MyDetails(){}
    public void printDetails(MyDetails details){
        System.out.println(details.name);
        System.out.println(details.age);
    }
}
