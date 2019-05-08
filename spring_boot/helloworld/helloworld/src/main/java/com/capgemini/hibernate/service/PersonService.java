package com.capgemini.hibernate.service;

import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.contoller.Person;

@Repository
public interface PersonService {

	
	public void addNew(Person person);
	public Person findbyId(int personId);
}
