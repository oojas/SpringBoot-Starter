package com.ojas.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;

@Configuration
public class AppConfig {
    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass();
    }

    @Bean
    public MyDetails myDetails(){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        return new MyDetails(name,age);
    }
}
