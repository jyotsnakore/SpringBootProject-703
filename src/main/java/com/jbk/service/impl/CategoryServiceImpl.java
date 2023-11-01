package com.jbk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.CategoryDao;
import com.jbk.model.Category;
import com.jbk.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao dao;

	@Override
	public int saveCategory(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Category> deleteCategory(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getCategoryById(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

}
