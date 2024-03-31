package com.example.cms.serviceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cms.dto.UserRequest;
import com.example.cms.dtoresponse.UserResponse;
import com.example.cms.entity.User;
import com.example.cms.exception.UserAlreadyExistEmailException;
import com.example.cms.exception.UserNotFoundByIdException;
import com.example.cms.repository.UserRepository;
import com.example.cms.service.UserService;
import com.example.cms.utility.ResponseStructure;


import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


	private UserRepository userrepo;
	private ResponseStructure<UserResponse> structure;
	private PasswordEncoder passwordencorder;
	
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> registerUser(  UserRequest userrequest) {
		
		if(userrepo.existsByEmail(userrequest.getEmail()))
			throw new UserAlreadyExistEmailException("Failed to register user");
		
			User user = userrepo.save(mapToUserEntity(userrequest, new User()));
		return ResponseEntity.ok(structure
				.setStatuscode(HttpStatus.OK.value())
				.setMessage("registered user successfully")
				.setBody(maptoUserResponse(user))
			);
		
	}

	private UserResponse maptoUserResponse(User user) {
		return UserResponse.builder()
				.userid(user.getUserid())
				.username(user.getUsername())
				.email(user.getEmail())
				.createdAt(user.getCreatedAt())
				.lastModifiedAt(user.getLastModifiedAt())
				.delete(true)
				.build();
	}

	private User mapToUserEntity(  UserRequest userrequest, User user) {
		user.setEmail(userrequest.getEmail());
		
		user.setUsername(userrequest.getUsername());
		user.setPassword(passwordencorder.encode(userrequest.getPassword()));
		
		return user;
	}

	
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> softDeleteUser(int userid) {
		
		User user =userrepo.findById(userid).orElseThrow(()-> new UserNotFoundByIdException("Delete not done"));
		user.setDelete(true);
		userrepo.save(user);
		
		return ResponseEntity.ok(structure.setStatuscode(HttpStatus.OK.value())
				.setMessage("SoftDeleted")
				.setBody(maptoUserResponse( new User(),true)));
		
	}

	private UserResponse maptoUserResponse(User user, boolean delete) {
		return UserResponse.builder()
				.userid(user.getUserid())
				.username(user.getUsername())
				.email(user.getEmail())
				.createdAt(user.getCreatedAt())
				.lastModifiedAt(user.getLastModifiedAt())
				
				.build();
	}
	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userid) {
//		
//		
//		User user = userrepo.findById(userid)
//				.orElseThrow(()->new UserNotFoundByIdException("The user id is not found"));
//
//			
//		return ResponseEntity.ok(structure.setStatuscode(HttpStatus.OK.value())
//				.setMessage("User deleted")
//				.setBody(maptoUserResponse(user)));
		return null;
	
		
	
	}
	
	


	
	
}


