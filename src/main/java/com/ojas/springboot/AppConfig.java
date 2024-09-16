package com.ojas.springboot;

import com.ojas.springboot.propertyreader.ApplicationPropertyReader;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @Qualifier("primary")
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("Ojas");
    }

    @Bean
    @Qualifier("secondary")
    public MyDetails myDetails(){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        int age=sc.nextInt();
        return new MyDetails("Varun",24);
    }


}
//Configuration classes are instantiated and the beans inside and registered everytime we start our application. That is why even after not using the
// myDetails method, the application is asking for user input.