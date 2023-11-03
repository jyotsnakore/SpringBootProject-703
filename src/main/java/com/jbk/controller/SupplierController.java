package com.jbk.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.exceptions.SupplierAlreadyExistsException;
import com.jbk.model.Supplier;
import com.jbk.service.SupplierService;
import com.jbk.validation.ObjectValidation;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService service;
	
	
	@PostMapping("/save-supplier")
	public String saveSupplier(@RequestBody @Valid Supplier supplier) {
		int status=service.saveSupplier(supplier);
		System.out.println(1);
		
		if(status==1) {
			return "Supplier Added!!";
		}else if(status==2)  {
			throw new SupplierAlreadyExistsException("Supplier Already Exists");
		}else {
			return "Invalid data!!";
		}
	}
	


}
