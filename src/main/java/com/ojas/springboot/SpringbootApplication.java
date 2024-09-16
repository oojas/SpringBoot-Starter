package com.ojas.springboot;

import com.ojas.springboot.propertyreader.ApplicationPropertyReader;
import com.ojas.springboot.propertyreader.CustomPropertyReader;
import com.ojas.springboot.propertyreader.ReadMultipleCustomProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		var ctx=SpringApplication.run(SpringbootApplication.class, args); // this basically returns the context of the application.
		MyFirstService myFirstService=ctx.getBean(MyFirstService.class);
		MyFirstTest myFirstTest=ctx.getBean(MyFirstTest.class);
		ApplicationPropertyReader applicationPropertyReader=ctx.getBean(ApplicationPropertyReader.class);
		CustomPropertyReader customPropertyReader=ctx.getBean(CustomPropertyReader.class);
		ReadMultipleCustomProperties readMultipleCustomProperties=ctx.getBean(ReadMultipleCustomProperties.class);
		System.out.println(myFirstService.tellStory());
		System.out.println(myFirstService.printMyDetails());
		System.out.println(myFirstTest.sayMyNameAndAge());
		System.out.println(applicationPropertyReader.getNameReader());
		System.out.println(applicationPropertyReader.getAgeReader());
		System.out.println(customPropertyReader.getUsername()+" "+customPropertyReader.getPassword());
		System.out.println(readMultipleCustomProperties.getOffice()+" "+readMultipleCustomProperties.getPosition()+" "+readMultipleCustomProperties.getEmployementYear());
//		System.out.println(configClass.myFirstClass().sayHello());
//		MyDetails myDetails=configClass.myDetails();
//		myDetails.printDetails(myDetails);
	}
}
