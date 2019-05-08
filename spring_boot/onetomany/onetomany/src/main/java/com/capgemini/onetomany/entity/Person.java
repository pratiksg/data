package com.capgemini.onetomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.springframework.context.annotation.Profile;

@Entity
public class Person {
	@Id
	private int  personId;
	private String personName;

	@OneToMany(cascade =CascadeType.ALL,orphanRemoval=true)
	
	private Set<Certificate> certificates;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String personName, Set<Certificate> certificates) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificates = certificates;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Set<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(Set<Certificate> certificates) {
		this.certificates = certificates;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certificates=" + certificates + "]";
	}
	
	

		
	}
		

