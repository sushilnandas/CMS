package com.example.cms.serviceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.cms.dto.BlogRequest;
import com.example.cms.dto.UserRequest;
import com.example.cms.dtoresponse.BlogResponse;
import com.example.cms.entity.Blog;
import com.example.cms.entity.User;
import com.example.cms.repository.BlogRepository;
import com.example.cms.service.BlogService;
import com.example.cms.utility.ResponseStructure;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class BlogServiceImpl implements BlogService {
	private BlogRepository blogRepository;
	private ResponseStructure<BlogResponse> structure;
	@Override
	public ResponseEntity<ResponseStructure<BlogResponse>> registerBlogs(int userid,BlogRequest blogRequest) {
		
		
		Blog blog= blogRepository.save(mapToBlogEntity(blogRequest ,new Blog()));
		
		return ResponseEntity.ok(structure.setStatuscode(HttpStatus.OK.value()).
				setMessage("Blog saved").
				setBody(mapToBlogResponse(blog)));
		
		
	
	}
	
	private Blog mapToBlogEntity(  BlogRequest blogRequest, Blog blog) {
		
		blog.setTitle(blogRequest.getTitle());
		blog.setAbout(blogRequest.getAbout());
		blog.setTopics(blogRequest.getTopics());

		return blog;
	}

	
	
	private BlogResponse mapToBlogResponse(Blog blog) {
		return BlogResponse.builder()
				.blogId(blog.getBlogId())
				.title(blog.getTitle())
				.topics(blog.getTopics())
				.about(blog.getAbout())
				.build();
	}
	

}
