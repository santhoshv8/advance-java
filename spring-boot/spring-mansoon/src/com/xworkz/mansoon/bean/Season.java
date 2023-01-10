package com.xworkz.mansoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private String duration;
	private String startingMonth;
	
	public Season() {
		
		System.out.println("Created Season using default Constructor");
	}
	
	@Value("winter")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("3 months")
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Value("November")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}
}
