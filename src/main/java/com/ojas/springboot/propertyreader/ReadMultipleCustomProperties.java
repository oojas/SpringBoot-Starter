package com.ojas.springboot.propertyreader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-2.properties")
})
public class ReadMultipleCustomProperties {
    @Value("${username.office}")
    private String Office;

    public String getPosition() {
        return position;
    }

    public String getOffice() {
        return Office;
    }
    @Value("${username.post}")
    private String position;

    public int getEmployementYear() {
        return employementYear;
    }

    @Value("${username.year}")
    private int employementYear;
}
