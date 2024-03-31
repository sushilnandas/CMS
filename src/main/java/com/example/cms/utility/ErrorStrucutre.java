package com.example.cms.utility;

import org.springframework.stereotype.Component;

@Component
public class ErrorStrucutre<T> {
	private int statuscode;
	private String message;
	private T rootcause;
	public int getStatuscode() {
		return statuscode;
	}
	public ErrorStrucutre<T> setStatuscode(int statuscode) {
		this.statuscode = statuscode;
		return this;
	}
	public String getMessage() {
		return message;
	}
	public ErrorStrucutre<T> setMessage(String message) {
		this.message = message;
		return this;
	}
	public T getRootcause() {
		return rootcause;
	}
	public ErrorStrucutre<T> setRootcause(T rootcause) {
		this.rootcause = rootcause;
		return this;
	}
	
	

}
