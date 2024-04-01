package com.example.cms.dto;



import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;




public class UserRequest {

	@NotNull(message="Enter user name")
	private String username;

	@NotNull(message="Invalid email")
	@Column(unique= true)
	@Email
	(regexp="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")

	private String email;

	@NotBlank(message="enter a password")
	@NotNull(message="enter a password")
	@Size(min=8,max=20,message="Password characters should exist with 8 to 20 characters")
	@Pattern
	(regexp= "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", 
	message = "Enter a valid password with 8 digit of length an Uppercase , a special character and a number")

	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
}
