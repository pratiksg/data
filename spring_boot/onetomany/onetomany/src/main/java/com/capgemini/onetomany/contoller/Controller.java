package com.capgemini.onetomany.contoller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.entity.Certificate;
import com.capgemini.onetomany.entity.Person;
import com.capgemini.onetomany.service.PersonService;

@RestController
public class Controller {
	
	@Autowired
	PersonService personService;
	
	@RequestMapping("/")
	public void add() {
		
		 Set<Certificate> set = new HashSet<>();
		Certificate c1=new Certificate(501,"advaceJava");
		Certificate c2=new Certificate(502,"AngularJS");
		Certificate c3=new Certificate(503,"datascience");
		
		set.add(c1);
		set.add(c2);
		set.add(c3);
		Person person=new Person(105,"Pratiksha",set);
		personService.save(person);
		
	}
	@RequestMapping("/new")
	public Person getPerson() {
		Person person = personService.findById(105).get();
		return person;
	}
}
