package com.shop.service;

import java.util.List;

import com.shop.entity.Category;

public interface CategoryService {
 public Category createCategory(Category category);
 
  public Category getCategoryDetails(Long categoryId);
  
public	void deleteCategory(Long categoryId);

public List<Category> GetAllCategoryRecord();

public Category updateCategory(Category category, Long categoryId);
}
