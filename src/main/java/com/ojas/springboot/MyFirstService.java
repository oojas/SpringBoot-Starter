package com.ojas.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    MyFirstClass myFirstClass;
    MyDetails myDetails;
    @Autowired
    public MyFirstService(@Qualifier("primary") MyFirstClass myFirstClass,@Qualifier("secondary") MyDetails myDetails) {
        this.myFirstClass = myFirstClass;
        this.myDetails = myDetails;
    }

    public String tellStory(){
        return "MY DEPENDENCY IS SAYING : "+myFirstClass.getName();
    }
    public String printMyDetails(){
        return "My name is "+myDetails.getName()+" and My age is "+myDetails.getAge();
    }
}
