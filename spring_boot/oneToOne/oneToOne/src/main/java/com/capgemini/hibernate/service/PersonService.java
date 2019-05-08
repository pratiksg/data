package com.capgemini.hibernate.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.hibernate.model.Person;

@RestController
public interface PersonService extends JpaRepository<Person, Integer>{

	

}
