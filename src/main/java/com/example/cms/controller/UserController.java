package com.example.cms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.cms.dto.UserRequest;
import com.example.cms.dtoresponse.UserResponse;

import com.example.cms.service.UserService;
import com.example.cms.utility.ResponseStructure;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
public class UserController {
	
	private UserService userservice;
	
     
	
	@PostMapping("/users/register")
	
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(@RequestBody @Valid UserRequest userrequest) {
		return userservice.registerUser(userrequest);
		
	}
	
	@GetMapping("/users/findUserById/{userid}")
	public ResponseEntity<ResponseStructure<UserResponse>> findUserById(@PathVariable int userid){
		return userservice.findUserById(userid);
	}
	
	@DeleteMapping("/users/deletedUserById/{userid}")
	public ResponseEntity<ResponseStructure<UserResponse>> softDeletedUser(@PathVariable int userid){
		return userservice.softDeletedUser(userid);
	}
	
	@GetMapping("/test")
	
	public String test() {
		return "Hello from cms";
	}
}
