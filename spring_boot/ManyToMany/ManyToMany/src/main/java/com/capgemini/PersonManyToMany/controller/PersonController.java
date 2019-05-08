package com.capgemini.PersonManyToMany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonManyToMany.entity.Person;
import com.capgemini.PersonManyToMany.entity.Project;
import com.capgemini.PersonManyToMany.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Set<Person> addNewPerson()
	{
		Set<Project> project = new HashSet<Project>();
		project.add(new Project(1, "java"));
		project.add(new Project(2, ".net"));
		
		Set<Person> person = new HashSet<Person>();
		person.add(new Person(101, "Pratiksha",project));
		person.add(new Person(102, "Pooja",project));
		service.addNew(person);
		return person;
		
		
		
		
	}
	
	@RequestMapping("/get") 
	public Person getPerson() 
	{ 
		Person person = service.getPerson(101);
		return person;
		 
		
	}
}
