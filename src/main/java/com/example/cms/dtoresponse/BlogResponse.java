package com.example.cms.dtoresponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter

@Setter
public class BlogResponse {

	
	private int blogId;
	private String title;
	private String[] topics;
	private String about;
	
	
	
}
