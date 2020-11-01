package com.haftom.gebreselassie.springbootrestfulproductservicecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haftom.gebreselassie.springbootrestfulproductservicecrud.domain.Product;
import com.haftom.gebreselassie.springbootrestfulproductservicecrud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired	
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> addProducts(List<Product> products){
		return productRepository.saveAll(products);
	}
	
	public String deleteProduct(Long id) {
		productRepository.deleteById(id);
		return "Product removed : " + id;
	}
	
	
	public Product updateProduct(Product product) {		
		Product pro = productRepository.findById(product.getId()).orElse(null);
		pro.setName(product.getName());
		pro.setPrice(product.getPrice());
		pro.setQuantity(product.getQuantity());		
		return productRepository.save(pro);
	}
	

}
