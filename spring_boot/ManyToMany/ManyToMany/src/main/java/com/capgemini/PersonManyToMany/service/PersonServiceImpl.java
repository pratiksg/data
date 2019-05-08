package com.capgemini.PersonManyToMany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.PersonManyToMany.dao.PersonDao;
import com.capgemini.PersonManyToMany.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	PersonDao dao;
	
	@Override
	public Set<Person> addNew(Set<Person> person) 
	{
		dao.saveAll(person);
		return person;
	}

	
	  @Override public Person getPerson(int id) 
	  { 
		  Person person = dao.findById(id).get();
		  return person; 
	  }
	 
	
}


