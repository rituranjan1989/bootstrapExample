package com.example.temp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class LoginModel {
	@Id
	int Id;

	

	@NotEmpty(message = "Please enter your email.")
	String Email;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 6, max = 15, message = "Your password must between 6 and 15 characters.")
	String password;
	
	@NotEmpty(message = "Please select user type.")
	String userType;

	public LoginModel() {
	}

	public LoginModel(String email, String password, String userType) {
		super();
		this.Email = email;
		this.password = password;
		this.userType = userType;
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
