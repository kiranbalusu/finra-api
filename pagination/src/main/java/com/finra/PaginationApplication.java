package com.finra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({ @PropertySource(ignoreResourceNotFound = true, value = "classpath:config.properties") })
public class PaginationApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
	}
	
	/** 
	 * Used when running as WAR
	 */
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PaginationApplication.class);
	}

}
