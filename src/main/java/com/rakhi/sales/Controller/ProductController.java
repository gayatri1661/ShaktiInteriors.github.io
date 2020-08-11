package com.rakhi.sales.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rakhi.sales.model.Products;
import com.rakhi.sales.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService servicep;
	
	@RequestMapping("/getAll")
	public List<Products> getAllProducts(){
		return servicep.getAllProducts();
	}
}
