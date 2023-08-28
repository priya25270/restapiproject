package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "inventory management",
				version = "1.1.2",
				description = "stock management",
				contact = @Contact(
						name = "Padmapriya",
						email = "727721euee062@skcet.ac.in"
						)
				)
		)
public class SwaggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggersApplication.class, args);
	}

}
