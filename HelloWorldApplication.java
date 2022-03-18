package com.kumoco.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);

		System.out.println("Starting POC Devops Automation - Demo");
		System.out.println("Say Hello to everyone");
		System.out.println("Update 1");
	}

}
