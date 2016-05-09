package com.vicboma._000_Hello_World;

import com.vicboma._001_Hello_World_Arguments.controller.ExampleControllerArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class AppSpringBootApplication_000 {

	public static void main(String[] args) {
		SpringApplication.run(ExampleControllerArguments.class, args);
	}
}
