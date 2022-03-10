package com.sg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.sg")
public class CustomerShareSpringbootMvcRestclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerShareSpringbootMvcRestclientApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
