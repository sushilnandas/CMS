package com.example.cms.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class ApplicationDocumentation {

	
	Contact contact() {
		return new Contact().name("SUSHILNANDAS").email("sushilchandran9927@gmail.com").url(".com");
	}
	
	@Bean
	Info info() {
		return new Info()
				.title("User Registration")
				.description("Content_Management_System")
				.version("")
				.contact(contact());
	}
	
	@Bean
	OpenAPI openAPI() {
		return new OpenAPI().info(info());
	}
	
	
}
