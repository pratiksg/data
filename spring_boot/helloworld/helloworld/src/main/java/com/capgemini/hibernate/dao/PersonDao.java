package com.capgemini.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.hibernate.contoller.Person;


@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{
	
	
	

}
