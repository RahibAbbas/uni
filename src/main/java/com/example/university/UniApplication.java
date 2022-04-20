package com.example.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniApplication {
//
	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(UniApplication.class, args);
	}

}
