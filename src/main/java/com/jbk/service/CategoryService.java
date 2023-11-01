package com.jbk.service;

import java.util.List;

import com.jbk.model.Category;

public interface CategoryService {
	public int saveCategory(Category category);
	public List<Category> deleteCategory(long categoryId);
	public Category getCategoryById(long categoryId);
	public List<Category> getAllCategory();
	public Category updateCategory(Category category);

}
