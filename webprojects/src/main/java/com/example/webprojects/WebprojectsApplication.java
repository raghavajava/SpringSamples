package com.example.webprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.webprojects")
@EntityScan("com.example.webprojects")
public class WebprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebprojectsApplication.class, args);
	}

}
