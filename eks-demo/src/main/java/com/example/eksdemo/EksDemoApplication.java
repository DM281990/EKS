package com.example.eksdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EksDemoApplication {



	public static void main(String[] args) {
		SpringApplication.run(EksDemoApplication.class, args);

	}

}
