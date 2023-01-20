package com.xworkz.spring.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class FirstAidDTO {

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String Tmeter;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30)
	private String Bage;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30)
	private String scrs;
	
	@NotNull
	@NotBlank
	@Size(min = 3, max = 30)
	private String twzers;
}
