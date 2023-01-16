package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProductModel;
import com.example.demo.repo.ProductRepo;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
	ProductRepo repo;

	@Override
	public ProductModel creatProctModel(ProductModel pModel) {
		// TODO Auto-generated method stub
		return repo.save(pModel);
	}

	@Override
	public List<ProductModel> FindAllProduct() {
		// TODO Auto-generated method stub
		return (List<ProductModel>) repo.findAll();
	}

	@Override
	public ProductModel FindProduct(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
	@Override
	public void DeleteProduct(Integer id) {
		repo.deleteById(id);
	}

	

}
