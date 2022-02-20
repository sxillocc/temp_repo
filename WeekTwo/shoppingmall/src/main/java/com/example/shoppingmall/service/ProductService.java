package com.example.shoppingmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingmall.entity.Product;
import com.example.shoppingmall.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//post method to write on database
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	//post method to write multiple products in database
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Product> getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "We removed Product having id:-"+ id;
	}
	
	public Product updateProduct(Product p) {
		Product temp = repository.findById(p.getId()).orElse(null);
		
		if(temp != null) {
			temp.setName(p.getName());
			temp.setQuantity(p.getQuantity());
			temp.setPrice(p.getPrice());
			return repository.save(temp);
		}
		return null;
	}
}
