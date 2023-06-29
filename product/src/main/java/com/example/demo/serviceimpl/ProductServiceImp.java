package com.example.demo.serviceimpl;

import java.util.List;

import com.example.demo.entity.Charges;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
@Service
public class ProductServiceImp implements ProductService {
	@Autowired
    ProductRepository repo;


	@Override


	public Product creatProctModel(Product pModel, Charges charges) {
            // TODO Auto-generated method stub
            pModel.setId(pModel.getId());
            pModel.setProductId(pModel.getProductId());
            pModel.setName(pModel.getName());
            pModel.setProductType(pModel.getProductType());
            pModel.setCategory(pModel.getCategory());
            pModel.setBasePrice(pModel.getBasePrice());
			Double discount=pModel.getBasePrice()*pModel.getDiscount()/100;
            pModel.setDiscount(discount);
            pModel.setCharges(charges);
			Double gst=(pModel.getBasePrice()-discount)* charges.getGst()/100;

            pModel.setFinalPrice((pModel.getBasePrice()-discount)+gst+ charges.getDelivery());
            return repo.save(pModel);
        }

	@Override
	public List<Product> FindAllProduct() {
		// TODO Auto-generated method stub
		return (List<Product>) repo.findAll();
	}

	@Override
	public Product FindProduct(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void DeleteProduct(Integer id) {
		repo.deleteById(id);
	}


}
