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
public class MissileDTO extends AbstractAuditDTO {

	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String contry;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String Type;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30)
	private String manufacture;
}
