package com.example.eksdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EksDemoApplication {

	@Value("${app.username}")
	private String username;
	@Value("${app.password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(EksDemoApplication.class, args);

	}

	@PostConstruct
	public void init() {
		System.out.print(username + "-------------" + password);
	}

}
