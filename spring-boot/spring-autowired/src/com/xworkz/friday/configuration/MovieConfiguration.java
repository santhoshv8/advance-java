package com.xworkz.friday.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.friday")
public class MovieConfiguration {

	public MovieConfiguration(){
		System.out.println("Created MovieConfiguration constructor by no args...");
	}
}
