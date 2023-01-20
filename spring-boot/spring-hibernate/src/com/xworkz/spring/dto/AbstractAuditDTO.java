package com.xworkz.spring.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AbstractAuditDTO implements Serializable{

	 private String createdBy;
     private LocalDateTime createdAt;
     private String updatedBy;
     private LocalDateTime updatedAt;
}
