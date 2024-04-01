package com.example.cms.service;

import org.springframework.http.ResponseEntity;

import com.example.cms.dto.BlogRequest;
import com.example.cms.dtoresponse.BlogResponse;
import com.example.cms.utility.ResponseStructure;

public interface BlogService {
	
	public ResponseEntity<ResponseStructure<BlogResponse>> registerBlogs(int userid,BlogRequest blogRequest);

}
