package com.xworkz.valentineapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "valentine_table")
public class ValentineEntity {

	@Id
	@Column(name = "v_id")
	private int id;
	
	@Column(name = "v_name")
	private String name;
	
	@Column(name = "v_valentine_name")
	private String valntineName;
	
	@Column(name = "v_place")
	private String place;
	
	@Column(name = "v_gift")
	private String gift;
}
