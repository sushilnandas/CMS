package com.example.cms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.dto.BlogRequest;
import com.example.cms.dtoresponse.BlogResponse;
import com.example.cms.service.BlogService;
import com.example.cms.utility.ResponseStructure;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BlogController {
private BlogService blogService;

@PostMapping("/users/{userid}/blogs")
public ResponseEntity<ResponseStructure<BlogResponse>> registerBlogs(@RequestBody BlogRequest blogRequest,@PathVariable int userid ){
	return blogService.registerBlogs(userid,blogRequest);
}


}
