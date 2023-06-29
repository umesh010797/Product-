package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Charges;
import com.example.demo.entity.Product;

public interface ProductService {
	public Product creatProctModel(Product pModel, Charges charges);
	public List<Product> FindAllProduct();
	public Product FindProduct(Integer id);
	public void DeleteProduct(Integer id);

}
