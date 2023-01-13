package com.xworkz.mansoon.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	private long number;
	private String version;
	private String company;
	private String stroke;

	@Autowired
	public Engine( @Qualifier("eName") String name,@Qualifier("eType") String type,@Qualifier("eCompany") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", stroke=" + stroke + "]";
	}



	@Value("4-Strokes")
	public void setStroke(String stroke) {
		this.stroke = stroke;
	}
}
