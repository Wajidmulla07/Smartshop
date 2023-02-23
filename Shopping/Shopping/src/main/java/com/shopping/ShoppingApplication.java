package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class ShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
