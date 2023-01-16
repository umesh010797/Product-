package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;

@RestController
public class ProductControl {
	@Autowired 
	ProductService pService;
	@PostMapping("/save")
	public ProductModel saveProduct(@RequestBody ProductModel pModel) {
		return pService.creatProctModel(pModel);
	}
	@GetMapping("/findall")
	public List<ProductModel> findProduct(){
		return pService.FindAllProduct();
	}
	@GetMapping("/find/{id}")
	public ProductModel getProduct(@PathVariable Integer id){
		return pService.FindProduct(id);
		}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteProduct(@PathVariable Integer id) {
		pService.DeleteProduct(id);
	}

}
