package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
