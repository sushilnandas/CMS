package com.example.cms.service;

import org.springframework.http.ResponseEntity;

import com.example.cms.dto.UserRequest;
import com.example.cms.dtoresponse.UserResponse;
import com.example.cms.utility.ResponseStructure;

public interface UserService {

	
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(UserRequest userrequest);
	public ResponseEntity<ResponseStructure<UserResponse>> softDeletedUser(int userid);
	public ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userid);
}
