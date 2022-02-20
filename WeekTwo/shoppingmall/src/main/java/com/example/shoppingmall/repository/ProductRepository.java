package com.example.shoppingmall.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.shoppingmall.entity.Product;


public interface ProductRepository extends JpaRepository <Product, Integer> {

	List<Product> findByName(String name);

}
