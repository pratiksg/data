package com.capgemini.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Profile{
	
	@Id
	private int personId;
	private String description;
	
	@OneToOne(mappedBy = "profile")
	private Person person;

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int personId, String description) {
		super();
		this.personId = personId;
		this.description = description;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Profile [personId=" + personId + ", description=" + description + ", person=" + person + "]";
	}
	
	
	
	
	
	
}