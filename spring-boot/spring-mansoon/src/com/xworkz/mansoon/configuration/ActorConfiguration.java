package com.xworkz.mansoon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mansoon.bean.Actor;

@Configuration
@ComponentScan("com.xworkz.mansoon")
public class ActorConfiguration {

	public ActorConfiguration() {

		System.out.println("Created ActorConfiguration");

	}
	
	@Bean
	public Actor actor2() {
		System.out.println("Registering another actor in spring...");
		Actor actor = new Actor();
		return actor; 
		
	}
}
