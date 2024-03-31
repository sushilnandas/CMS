package com.example.cms.utility;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;


@Configuration
@EnableJpaAuditing
public class AuditingConfig {
	
//	@Bean
//	 AuditorAware<String> auditor(Authentication authentication){
//		
//		return ()-> Optional.of(authentication.getName());
	//}

}
