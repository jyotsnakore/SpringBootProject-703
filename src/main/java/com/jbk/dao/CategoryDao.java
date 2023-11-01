package com.jbk.dao;

import java.util.List;

import com.jbk.model.Category;

public interface CategoryDao {
	public int saveCategory(Category category);
	public List<Category> deleteCategory(long categoryId);
	public Category getCategoryById(long categoryId);
	public List<Category> getAllCategory();
	public Category updateCategory(Category category);


}
