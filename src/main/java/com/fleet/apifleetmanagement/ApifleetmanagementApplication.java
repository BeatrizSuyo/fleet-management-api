package com.fleet.apifleetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.fleetmanagement.repository")
@SpringBootApplication
public class ApifleetmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApifleetmanagementApplication.class, args);
	}

}
