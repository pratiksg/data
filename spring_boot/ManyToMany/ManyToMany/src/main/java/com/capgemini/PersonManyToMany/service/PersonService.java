package com.capgemini.PersonManyToMany.service;

import java.util.Set;

import com.capgemini.PersonManyToMany.entity.Person;

public interface PersonService {

	Set<Person> addNew(Set<Person> person);

	Person getPerson(int id);

}
