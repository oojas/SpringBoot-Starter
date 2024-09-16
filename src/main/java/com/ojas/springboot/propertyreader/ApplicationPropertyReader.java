package com.ojas.springboot.propertyreader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApplicationPropertyReader {

    @Value("${app.name}")
    private  String nameReader;
    @Value("${app.age}")
    private int ageReader;
    public String getNameReader() {
        return nameReader;
    }
    public int getAgeReader() {
        return ageReader;
    }



}
