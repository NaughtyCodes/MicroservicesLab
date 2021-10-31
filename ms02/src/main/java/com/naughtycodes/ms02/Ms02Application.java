package com.naughtycodes.ms02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms02Application.class, args);
	}

}
