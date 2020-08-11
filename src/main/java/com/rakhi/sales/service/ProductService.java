package com.rakhi.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakhi.sales.model.Products;
import com.rakhi.sales.repository.Productrepo;

@Service
public class ProductService {
	
	@Autowired
	Productrepo productrepo;
	
	public  List<Products>getAllProducts(){
		return productrepo.findAll();
	}
}
