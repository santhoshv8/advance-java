package com.xworkz.turbineapp.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TurbineDTO {

	@Id
	private int id;
	
	@Size(min = 3 , max = 20 , message = "Comapany should be grester than 3 and less than 20")
	private String company;
	
	@Size(min = 3 , max = 20 , message = "name should be grester than 3 and less than 20")
	private String name;
	 
	@NotNull(message = "cost should not be null")
	private Double cost;
	
	@NotBlank(message = "type should not be null")
	private String type;
	
	@NotBlank(message = "country should not be null")
	private String country;
}
