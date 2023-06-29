package com.example.demo.controller;

import java.util.List;

import com.example.demo.entity.Charges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired 
	ProductService pService;
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product pModel,@RequestParam Charges charges) {
		return pService.creatProctModel(pModel,charges);
	}
	@GetMapping("/findall")
	public List<Product> findProduct(){
		return pService.FindAllProduct();
	}
	@GetMapping("/find/{id}")
	public Product getProduct(@PathVariable Integer id){
		return pService.FindProduct(id);
		}
	
	@DeleteMapping("/delete/{id}")
	public void DeleteProduct(@PathVariable Integer id) {
		pService.DeleteProduct(id);
	}

}
