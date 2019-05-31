package com.qa.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Account {
	
	@Id
	@GeneratedValue
	int id;
	String firstName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
