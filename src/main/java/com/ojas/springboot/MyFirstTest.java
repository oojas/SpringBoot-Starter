package com.ojas.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTest {
    @Autowired
    public MyFirstTest(MyDetails myDetails) {
        this.myDetails = myDetails;
    }

    MyDetails myDetails;

    public String sayMyNameAndAge(){
        return "HIIIIIIII, My name is : "+myDetails.getName()+" And my age is : "+myDetails.getAge();
    }
}
