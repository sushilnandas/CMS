package com.example.cms.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class BlogNotFoundByIdException extends RuntimeException {

	
	private String message;
}
