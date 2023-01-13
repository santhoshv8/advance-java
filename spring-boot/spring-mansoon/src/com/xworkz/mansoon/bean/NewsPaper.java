package com.xworkz.mansoon.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {

	private String name;
	private String ownerName;

	@Value("544")
	private int id;

	@Value("kannada")
	private String lang;

	private double price;

	@Autowired
	public NewsPaper(@Qualifier("name") String name, @Value("JAYRAJ") String ownerName) {
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

	@Value("5.5")
	public void setPrice(double price) {
		this.price = price;
	}
}
