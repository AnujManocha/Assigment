package com.example.Assigment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Assigment")
public class AssigmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssigmentApplication.class, args);
	}

}
