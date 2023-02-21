package com.xworkz.valentineapp.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDTO {

	@Id 
	private int id;
	
	@Size(min = 3,max = 20, message = "Name Should be greater than 3 and less than 20")
	private String name;
	
	@Size(min = 3,max = 20,message = "Valentine Name Should be greater than 3 and less than 20")
	private String valentineName;
	
	@NotBlank(message = "Place should not be null")
	private String place;
	
	@NotBlank(message = "Gift should not be null")
	private String gift;

	
	
	
}
