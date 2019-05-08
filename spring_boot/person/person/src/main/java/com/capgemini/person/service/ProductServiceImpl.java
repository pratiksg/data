package com.capgemini.person.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.person.dao.ProductDao;
import com.capgemini.person.entity.Product;

public class ProductServiceImpl implements ProductService{
	
	
	@Autowired
	private ProductDao dao;
	
	@Override
	public Optional<Product> findProductById(int id) {
		Optional<Product> p = dao.findById(id);
		return p;
	}

	@Override
	public Product addNew(Product person) {
		return dao.save(person);
		
	}

	@Override
	public boolean deletePraduct(int id) {
		Optional<Product> p = findProductById(id);
		if(p==null)
			return false;
		dao.deleteById(id);
		return true;
	}
	@Override
	public Optional<Product> findProductById1(int id) {
		Optional<Product> p = dao.findById(id);
		return p;
	}
	
	@Override
	public boolean updateProduct(Product product) {
		Product p = dao.save(product);
		if(p!=null)
			return true;
		return false;
	}
}
