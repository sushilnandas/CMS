package com.example.cms.dto;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BlogRequest {
	
	@NotNull
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp="[a-zA-Z]+")
	private String title;
	
	@Column(nullable = false)
	private String[] topics;
	
	private String about;
	
	

}
