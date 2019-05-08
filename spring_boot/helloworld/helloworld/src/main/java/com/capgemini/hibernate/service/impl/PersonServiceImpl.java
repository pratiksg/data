package com.capgemini.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.contoller.Person;
import com.capgemini.hibernate.dao.PersonDao;
import com.capgemini.hibernate.service.PersonService;

@Repository
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao personDao;
	
	@Override
	public void addNew(Person person) {
		personDao.save(person);		
	}

	@Override
	public Person findbyId(int personId) {
		Person person = personDao.findById(personId).get();
		return person;
	}

}
