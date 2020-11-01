package com.haftom.gebreselassie.springbootrestfulproductservicecrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private int quantity;
	
	private double price;

}
