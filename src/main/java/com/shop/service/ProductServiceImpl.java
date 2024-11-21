package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.shop.entity.Category;
import com.shop.entity.Product;
import com.shop.repo.CategoryRepo;
import com.shop.repo.ProductRepo;
@Service
public class ProductServiceImpl  implements ProductService{

@Autowired
private ProductRepo productRepo;
	@Override
	 public Product createProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }
	
	@Override
	public Product getProductDetails(Long productId) {
		Product c1=productRepo.findById(productId).get();
		return c1;
	}

	@Override
	public void deleteProduct(Long productId) {
		productRepo.deleteById(productId);
	}

	@Override
	public List<Product> GetAllProductRecord() {
		 List<Product> pro= productRepo.findAll();
			return pro;
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		 if (productRepo.existsById(id)) {
	            product.setProductId(id);
	            return productRepo.save(product);
	        }
	        return null;
	    }
	}


