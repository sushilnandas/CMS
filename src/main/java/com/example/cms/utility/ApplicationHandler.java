package com.example.cms.utility;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.cms.exception.UserAlreadyExistEmailException;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


@RestControllerAdvice

@AllArgsConstructor
public class ApplicationHandler {

	private ErrorStrucutre<String> structure;

	private ResponseEntity<ErrorStrucutre<String>> errorResponse(HttpStatus status,String message,String rootcause){
		return new ResponseEntity<ErrorStrucutre<String>>(structure.setStatuscode(status.value()).
				setMessage(message).setRootcause(rootcause),status);
	}


      

	@ExceptionHandler
public ResponseEntity<ErrorStrucutre<String>> handleUserAlreadyExistsByEmail(UserAlreadyExistEmailException ex){
	return errorResponse(HttpStatus.BAD_REQUEST,ex.getMessage(),"User Already existes with the given email ID");



	}




}
