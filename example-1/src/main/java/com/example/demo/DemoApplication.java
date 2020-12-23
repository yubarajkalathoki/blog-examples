package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Change 1: Added this annotation
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/**
	 * Change 2: Method to print the message when user invokes the url:
	 * http://localhost:8080
	 */
	@GetMapping
	public String sayHello() {
		return "Hello world!";
	}
}
