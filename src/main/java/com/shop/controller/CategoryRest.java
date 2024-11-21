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

import com.shop.entity.Category;
import com.shop.service.CategoryService;
@RestController
@RequestMapping("/catagory")
public class CategoryRest {
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/add")
	public Category createCategory( @RequestBody Category category) {
		Category c1 = categoryService.createCategory(category);
        return c1;
}
	@GetMapping("/getdetails/{categoryId}")
	public Category getCustomer(@PathVariable Long categoryId) {
		Category c2=categoryService.getCategoryDetails(categoryId);
		return c2; 
}
	@DeleteMapping("/delete/{categoryId}")
	public void delete(@PathVariable Long categoryId)
	{
	          categoryService.deleteCategory(categoryId);
}
	@GetMapping("/getall")
	public List<Category> showAll()
	{
		List<Category> list=categoryService.GetAllCategoryRecord();
		return list;	
	}
	@PutMapping("/update/{categoryId}")
	public Category updateCategory(@RequestBody Category category,	@PathVariable Long categoryId) {
		Category category1 = categoryService.updateCategory(category, categoryId);
		return category1;
	}
}