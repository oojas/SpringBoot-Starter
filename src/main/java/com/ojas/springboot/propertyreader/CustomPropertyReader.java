package com.ojas.springboot.propertyreader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class CustomPropertyReader {
    @Value("${username.name}")
    private String username;
    @Value("${password.pass}")
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
