package com.example.cms.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TitleNotAvailableException extends RuntimeException {
	public TitleNotAvailableException(String string) {
		this.message=message;
	}

	private String message;
	

}
