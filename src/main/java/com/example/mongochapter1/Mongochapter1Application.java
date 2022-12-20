package com.example.mongochapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class Mongochapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mongochapter1Application.class, args);
	}

}
