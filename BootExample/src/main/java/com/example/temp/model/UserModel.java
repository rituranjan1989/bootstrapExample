package com.example.temp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "user")
public class UserModel {
	@Id
	int id;

	@NotEmpty(message="Please enter your name.")
	String name;
	
	@NotEmpty(message="Please enter your email.")
	String email;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters.")
	String password;
	
	@NotEmpty(message="Please select user type.")
	String userType;

	public UserModel() {
	}

	public UserModel(String name, String email, String password, String userType) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
