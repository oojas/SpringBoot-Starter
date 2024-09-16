package com.ojas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(SpringbootApplication.class, args); // this basically returns the context of the application.
		AppConfig configClass=ctx.getBean(AppConfig.class);
		System.out.println(configClass.myFirstClass().sayHello());
		MyDetails myDetails=configClass.myDetails();
		myDetails.printDetails(myDetails);
	}
}
