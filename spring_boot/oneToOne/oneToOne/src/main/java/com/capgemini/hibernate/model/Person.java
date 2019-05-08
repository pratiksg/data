package com.capgemini.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	
	@Id
	private int pId;
	private String pName;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(unique=true)
	private Profile profile;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pId, String pName, Profile profile) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.profile = profile;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", profile=" + profile + "]";
	}
	
	
	

}