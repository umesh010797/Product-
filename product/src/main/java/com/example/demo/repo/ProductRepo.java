package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ProductModel;

import jakarta.persistence.Id;

public interface ProductRepo extends CrudRepository<ProductModel, Integer>{
	
	

	

}
