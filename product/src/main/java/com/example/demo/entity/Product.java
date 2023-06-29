package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	@Id
	private Integer id;
	private String productId;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	private double discount;
	@ManyToOne
	@JoinColumn(name = "charges_id")
	private Charges charges;

	private double finalPrice;
	
	



}
