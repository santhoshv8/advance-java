package com.xworkz.mansoon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mansoon.bean.Rocket;

@Configuration
@ComponentScan("com.xworkz.mansoon") 
public class RocketConfiguration {

	public RocketConfiguration() {

		System.out.println("Created RocketConfiguration");
	}
	
	@Bean
	public Rocket rocket2() {

		System.out.println("Registering rocket2 with spring...");
		Rocket rocket2 = new Rocket("India","PSLV", 486522410);
		return rocket2; 
	}
}
