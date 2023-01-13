package com.xworkz.mansoon.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mansoon")
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
		System.out.println("NewsPaper Configuration");
	}

	@Bean
	public String name() {
		return "Garibi Hatavoo";
	}

	@Bean
	public double price() {
		return 5.5;
	}

	@Bean
	public String sName() {
		return "King Kobra";
	}

	@Bean
	public String sType() {
		return "Indian Snake";
	}

	@Bean
	public boolean sPos() {
		return true;
	}

	@Bean
	public String eName() {
		return "Petrol Engine";
	}

	@Bean
	public String eType() {
		return "Petrol";
	}

	@Bean
	public String eCompany() {
		return "HERO";
	}
	
	@Bean
	public String gname() {
		return "English";
	}
	@Bean
	public String gmotherName() {
		return "adverb";
	}
	@Bean
	public String gfatherName  () {
		return "preposition";
	}
	@Bean
	public LocalDate gdateOfBirth() {
		return LocalDate.of(1981,3,12);
	}
	@Bean
	public LocalDate gdateOfDeath() {
		return LocalDate.of(2020,9,24);
	}
	@Bean
	public String gyoungerSisterName() {
		return "verb";
	}
	@Bean
	public String gelderSisterName() {
		return "pronoun";
	}
	@Bean
	public String gyoungerBrotherName() {
		return "adjective";
	}
	@Bean
	public String  gelderBrotherName() {
		return  "noun";
	}
	@Bean
	public boolean prelegs() {
		return true;
	}
}
