package com.xworkz.spring.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
  
	@Bean
	public String getString() {
		
		System.out.println("Registering String with spring");
		String string = new String();
		return string;
	}
	
	@Bean
	public Boolean getBoolean() {
		
		System.out.println("Registering Boolean with spring");
		Boolean ref = new Boolean(false);
		return ref; 
	}
	
	@Bean
	public Double getDouble() {
		
		System.out.println("Registering Double with spring");
		Double ref1 = new Double(5);
		return ref1; 
	} 
	
	@Bean 
	public List<Integer> getArrayList(){
		
	 	System.out.println("Resistering ArrayList with spring");
		List<Integer> array = new ArrayList<Integer>();
		return array;
		
	}
	 
	@Bean
	public Map<String, Integer> getMap(){
		
		System.out.println("Resistering map with spring");
		Map<String, Integer> map = new HashMap<String, Integer>();
		return map;
		
	}
	
	 
}
 