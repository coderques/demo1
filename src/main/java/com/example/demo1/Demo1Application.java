package com.example.demo1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;


@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class);
	}
}
