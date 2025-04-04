package com.pinku.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://www.youtube.com/watch?v=LJkkFx7zJJQ

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {

	@GetMapping("/")
	public String home(){
		return "Welcome to AWS First Deployment....!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsExampleApplication.class, args);
	}

}
