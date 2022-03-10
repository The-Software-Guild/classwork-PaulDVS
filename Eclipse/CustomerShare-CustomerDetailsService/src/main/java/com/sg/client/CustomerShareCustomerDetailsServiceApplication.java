package com.sg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages ="com.sg")
@EntityScan(basePackages = "com.sg.entities")
public class CustomerShareCustomerDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerShareCustomerDetailsServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
