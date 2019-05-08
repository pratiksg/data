package com.capgemini.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.model.Person;
import com.capgemini.hibernate.model.Profile;
import com.capgemini.hibernate.service.PersonService;


@RestController
public class Controller {
	
	@Autowired
	PersonService personService;

	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(101, "Pratiksha", new Profile(201, "Java"));
		personService.save(person);
	}

	@RequestMapping("/new")
	public Person getPerson() {
		Person person = personService.findById(101).get();
		return person;
	}
	

}
