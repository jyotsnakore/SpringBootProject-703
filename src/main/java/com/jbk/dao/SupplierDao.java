package com.jbk.dao;

import java.util.List;

import com.jbk.model.Supplier;

public interface SupplierDao {
	public int saveSupplier(Supplier supplier);
	public List<Supplier> deleteSupplier(long supplierId);
	public Supplier getSupplierById(long supplierId);
	public List<Supplier> getAllSupplier();
	public Supplier updateSupplier(Supplier supplier);


}
