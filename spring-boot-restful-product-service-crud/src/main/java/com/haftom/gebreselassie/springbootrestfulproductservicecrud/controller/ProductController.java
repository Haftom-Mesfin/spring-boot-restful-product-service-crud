package com.haftom.gebreselassie.springbootrestfulproductservicecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haftom.gebreselassie.springbootrestfulproductservicecrud.domain.Product;
import com.haftom.gebreselassie.springbootrestfulproductservicecrud.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable Long id) {		
		return productService.getProductById(id);
	}
	
	@GetMapping("/products/{name}")
	public Product getProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

}
