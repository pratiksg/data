package com.capgemini.sprinbootMockitoApplication.dao;

import java.util.List;

import com.capgemini.sprinbootMockitoApplication.model.User;


public interface UserRepository {

	User save(User user);

	List<User> findAll();

	List<User> findByAddress(String address);

	void delete(User user);

}
