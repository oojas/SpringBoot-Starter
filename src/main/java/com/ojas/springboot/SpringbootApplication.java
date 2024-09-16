package com.ojas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(SpringbootApplication.class, args); // this basically returns the context of the application.
		MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
		MyFirstTest myFirstTest=ctx.getBean(MyFirstTest.class);
		System.out.println(myFirstService.tellStory());
		System.out.println(myFirstService.printMyDetails());
		System.out.println(myFirstTest.sayMyNameAndAge());
//		System.out.println(configClass.myFirstClass().sayHello());
//		MyDetails myDetails=configClass.myDetails();
//		myDetails.printDetails(myDetails);
	}
}
