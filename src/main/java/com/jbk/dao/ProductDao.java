package com.jbk.dao;

import java.util.List;

import com.jbk.model.Product;

public interface ProductDao {

	public int saveProduct(Product product);
	public List<Product> deleteProduct(long productId);
	public Product getProductById(long productId);
	public List<Product> getAllProduct();
	public Product updateProduct(Product product);
}
