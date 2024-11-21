package com.shop.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.entity.Category;
import com.shop.repo.CategoryRepo;
@Service
public class CategoryServiceImpl  implements CategoryService{
@Autowired
private CategoryRepo categoryRepo;
	@Override
	public Category createCategory(Category category) {
		  Category c1= categoryRepo.save(category);
		  return c1;
	}

	@Override
	public Category getCategoryDetails(Long categoryId) {
		Category c1=categoryRepo.findById(categoryId).get();
		return c1;
	}

	@Override
	public void deleteCategory(Long categoryId) {
		categoryRepo.deleteById(categoryId);
		
	}

	@Override
	public List<Category> GetAllCategoryRecord() {
		  List<Category> cat= categoryRepo.findAll();
			return cat;
	}

	@Override
	public Category updateCategory(Category category, Long categoryId) {
		 Optional<Category> existingCategory = categoryRepo.findById(categoryId);
		    
		    if (existingCategory.isPresent()) {
		        Category currentCategory = existingCategory.get();
		        currentCategory.setCategoryName(category.getCategoryName());
		        return categoryRepo.save(currentCategory);
		    } else {
		        throw new EntityNotFoundException("Category with id " + categoryId + " not found");
		    }

	}
}
