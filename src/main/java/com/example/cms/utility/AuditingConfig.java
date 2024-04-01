package com.example.cms.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
	
//	@Bean
//	 AuditorAware<String> auditor(Authentication authentication){
//		
//		return ()-> Optional.of(authentication.getName());
	//}

}
