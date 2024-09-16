package com.ojas.springboot;

public class MyFirstClass {
    public String getName() {
        return name;
    }

    private String name;
    public MyFirstClass(String name) {
        this.name = name;
    }
    public String sayHello(){
        return "Hello World from : ==> "+name;
    }
}
