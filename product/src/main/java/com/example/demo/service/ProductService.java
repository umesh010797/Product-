package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ProductModel;

public interface ProductService {
	public ProductModel creatProctModel(ProductModel pModel);
	public List<ProductModel> FindAllProduct();
	public ProductModel FindProduct(Integer id);
	public void DeleteProduct(Integer id);

}
