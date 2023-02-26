package com.xworkz.eggapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="egg_table")
public class EggDTO {

	
	@Column(name = "e_id")
	@Id
	private int id;
	
	@Column(name ="e_hotelName")
	private String hotelName;
	 
	@Column(name ="e_dishName")
	private String dishName;
	
	@Column(name ="e_type")
	private String type;
	
	@Column(name ="e_price")
	private Double price;
	
	@Column(name ="e_quantity")
	private Integer quantity;
	
	@Column(name ="e_takeAway")
	private Boolean takeAway;
} 
 