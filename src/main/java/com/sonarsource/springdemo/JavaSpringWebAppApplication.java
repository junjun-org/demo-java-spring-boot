package com.sonarsource.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringWebAppApplication {

	public static void main(String[] args) {
		System.out.println("init...");
		SpringApplication.run(JavaSpringWebAppApplication.class, args);
	}

}
