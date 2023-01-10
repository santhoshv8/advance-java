package com.xworkz.mansoon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.mansoon.bean.Season;

@Configuration
@ComponentScan("com.xworkz.mansoon")
public class SeasonConfiguration {

	public SeasonConfiguration() {
 
		System.out.println("Created SeasonConfiguration");
	}

	@Bean
	public Season season2() {

		System.out.println("Registering season2 with spring...");
		Season season2 = new Season();
		return season2;
 

	}
}
