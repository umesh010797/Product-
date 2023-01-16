package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductModel {
	@Id
	private Integer productId;
	private String name;
	private String productType;
	private String category;
	private double basePrice;
	private double discount;
	private double gst;
	private double delivery;
	private double finalPrice;
	
	
	public ProductModel() {
		super();
	}


	public ProductModel(Integer productId, String name, String productType, String category, double basePrice, double delivery) {
		super();
		this.productId = productId;
		this.name = name;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
		this.delivery=delivery;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}


	public double getDiscount() {
		return (basePrice*discount)/100;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getGst() {
		return (basePrice*gst)/100;
	}


	public void setGst(double gst) {
		this.gst = gst;
	}


	public double getDelivery() {
		return delivery;
	}


	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}


	public double getFinalPrice() {
		return getBasePrice()-getDiscount()+getGst()+getDelivery();
	}


	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	



}
