package com.kakumani.boot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.kakumani.boot.app")
@SpringBootApplication
public class SpringBootJpaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaAppApplication.class, args);
	}

}
