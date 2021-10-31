package com.naughtycodes.ms01;

import com.naughtycodes.ms01.models.MovieDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ms01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ms01Application.class, args);
		MovieDetails md = new MovieDetails(04,"vada chennai","a vetrimaran movie", 2019, null);
		System.out.println(md.toString());
	}

}
