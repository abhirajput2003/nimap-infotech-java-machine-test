package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.entity.Product;
import com.shop.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductRest {
	@Autowired
private ProductService productService;

	 @PostMapping("/create")
	    public Product createProduct(@RequestBody Product product) {
	        return productService.createProduct(product);
	    }
	 @GetMapping("/getdetails/{productId}")
		public Product getProduct(@PathVariable Long productId) {
			
		 Product c2=productService.getProductDetails(productId);
			return c2; 
}
	 @DeleteMapping("/delete/{productId}")
		public void delete(@PathVariable Long productId)
		{
		 productService.deleteProduct(productId);
	}
	 @GetMapping("/getall")
		public List<Product> showAll()
		{
			List<Product> list=productService.GetAllProductRecord();
			return list;	
		}
	 @PutMapping("/update/{id}")
	 public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
	     Product updatedProduct = productService.updateProduct(id, product);
	     return updatedProduct != null ? updatedProduct : null;
	 }
}