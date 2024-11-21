package com.shop.service;

import java.util.List;

import com.shop.entity.Product;

public interface ProductService {
	public Product createProduct( Product product);
	 
	  public Product getProductDetails(Long productId);
	  
	public	void deleteProduct(Long productId);

	public List<Product> GetAllProductRecord();

	 public Product updateProduct(Long id, Product product);
}
