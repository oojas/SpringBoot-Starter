package com.ojas.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyFirstClass myFirstClass(){
        return new MyFirstClass();
    }
    @Bean
    public MyDetails myDetails(){
        return new MyDetails("Ojas",24);
    }

}
