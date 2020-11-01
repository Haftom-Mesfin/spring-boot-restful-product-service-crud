package com.haftom.gebreselassie.springbootrestfulproductservicecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haftom.gebreselassie.springbootrestfulproductservicecrud.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	public Product findByName(String name);
}
