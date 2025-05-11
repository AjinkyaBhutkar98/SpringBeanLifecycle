package com.ajinkyabhutkar.springBootDemo;

import com.ajinkyabhutkar.springBootDemo.beans.Chef;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {


	/*
	@Configuration
	it is
	 */

	public static void main(String[] args) {

		System.out.println("Starting application");

		ConfigurableApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
		/*
		it will boot up spring boot application
		1. scans the classpath for components
		2. autoconfigures the application based on classpath
		3. starts your application
		 */

		Chef masterchef=context.getBean("myChef", Chef.class);

		System.out.println(masterchef);
		masterchef.order();

	}

}
