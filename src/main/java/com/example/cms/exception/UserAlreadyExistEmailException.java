package com.example.cms.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserAlreadyExistEmailException extends RuntimeException {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
