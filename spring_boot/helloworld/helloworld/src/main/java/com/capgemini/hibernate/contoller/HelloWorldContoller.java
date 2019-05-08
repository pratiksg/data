package com.capgemini.hibernate.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.service.PersonService;

@RestController()
public class HelloWorldContoller {

	@Autowired
	PersonService personService;

	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(101, "Pratiksha");
		personService.addNew(person);
	}

	@RequestMapping("/new")
	public Person getPerson() {
		Person person = personService.findbyId(101);

		return person;
	}

}
