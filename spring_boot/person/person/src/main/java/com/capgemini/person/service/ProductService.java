package com.capgemini.person.service;

import java.util.Optional;

import com.capgemini.person.entity.Product;

public interface ProductService {

	Optional<Product> findProductById(int i);

	Product addNew(Product product);

	//boolean deletePraduct(int id);

	boolean deletePraduct(int id);

	boolean updateProduct(Product product);

	Optional<Product> findProductById1(int id);

}
