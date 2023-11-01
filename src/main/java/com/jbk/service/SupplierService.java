package com.jbk.service;

import java.util.List;

import com.jbk.model.Category;
import com.jbk.model.Supplier;

public interface SupplierService {
	
	public int saveSupplier(Supplier supplier);
	public List<Supplier> deleteSupplier(long supplierId);
	public Supplier getSupplierById(long supplierId);
	public List<Supplier> getAllSupplier();
	public Supplier updateSupplier(Supplier supplier);


}
