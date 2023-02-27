package com.xworkz.turbineapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "turbine")
public class TurbineEntity {

	@Id
	@Column(name = "t_id")
	private int id;
	
	@Column(name = "t_company")
	private String company;
	
	@Column(name = "t_name")
	private String name;
	
	@Column(name = "t_cost")
	private Double cost;
	
	@Column(name = "t_type")
	private String type;
	
	@Column(name = "t_country")
	private String country;
}
