package com.capgemini.person.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.person.entity.Product;
import com.capgemini.person.service.ProductService;

@RestController
public class MyController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String addProduct() {
		Product product = new Product(1,"Soap",10);
		service.addNew(product);
		return "added";
	}
	
	@RequestMapping("/get")
	public Optional<Product> readProduct() {
		
		Optional<Product> product = service.findProductById(1);
		return product;
		
	}
	
	@RequestMapping("/delete/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable int id) 
	{
		Optional<Product> product=service.findProductById(id);
		return product.map(p ->{if(service.deletePraduct(id))
			return ResponseEntity.ok().build();
		return ResponseEntity.status( HttpStatus.INTERNAL_SERVER_ERROR).build();
		}).orElse(ResponseEntity.notFound().build());
	
	}
}



