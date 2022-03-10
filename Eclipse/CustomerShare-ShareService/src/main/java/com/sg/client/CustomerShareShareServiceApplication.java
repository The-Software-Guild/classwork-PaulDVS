package com.sg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages ="com.sg")
@EntityScan(basePackages = "com.sg.entities")
@EnableJpaRepositories(basePackages = "com.sg.persistence")
public class CustomerShareShareServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerShareShareServiceApplication.class, args);
	}

}
