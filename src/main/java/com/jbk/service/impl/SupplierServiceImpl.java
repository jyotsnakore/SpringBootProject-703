package com.jbk.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.SupplierDao;
import com.jbk.model.Supplier;
import com.jbk.service.SupplierService;
import com.jbk.validation.ObjectValidation;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao dao;
	
	@Override
	public int saveSupplier(Supplier supplier) {
		String supplierId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		supplier.setSupplierId(Long.parseLong(supplierId));


		return dao.saveSupplier(supplier);	
	}

	@Override
	public List<Supplier> deleteSupplier(long supplierId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Supplier getSupplierById(long supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return null;
	}

}
