package com.jbk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.ProductDao;
import com.jbk.dao.impl.ProductDaoImpl;
import com.jbk.model.Product;
import com.jbk.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao dao;

	@Override
	public int saveProduct(Product product) {
		return 0;
		
	}

	@Override
	public Product getProductById(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> deleteProduct(long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
}
